package org.lc.video.service;

import org.lc.video.mapper.CourseMapper;
import org.lc.video.model.Course;
import org.lc.video.model.CourseExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements ICourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public List<Course> findAllCourse() {

        CourseExample example = new CourseExample();
        CourseExample.Criteria criteria = example.createCriteria();

        criteria.andDeleteEqualTo(false);//未删除的
        return courseMapper.selectByExample(example);
    }

//    public List<Course> getCourseByNameSubject(String name,Integer subjectId){
//        CourseExample courseExample = new CourseExample();
//        CourseExample.Criteria criteria = courseExample.createCriteria();
//
//    }
    @Override
    public Course saveCourse(Course course){

        courseMapper.insertSelective(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course){

        courseMapper.updateByPrimaryKeySelective(course);
        return course;
    }

    @Override
    public int deleteCourse(String courseId) {

        Course course = new Course();
        course.setCourseId(Long.valueOf(courseId));
        course.setDelete(true);

        CourseExample example = new CourseExample();
        CourseExample.Criteria criteria = example.createCriteria();
        criteria.andCourseIdEqualTo(Long.valueOf(courseId));

        return courseMapper.updateByExampleSelective(course,example);
    }

    @Override
    public List<Course> findCourse(String searchTitle, String searchSubId) {


        CourseExample example = new CourseExample();
        CourseExample.Criteria criteria = example.createCriteria();
        if (searchTitle != null){
            criteria.andTitleLike("%"+searchTitle+"%");
        }

        if (searchSubId != null){
            criteria.andSubjectIdEqualTo(Long.valueOf(searchSubId));
        }
        criteria.andDeleteEqualTo(false);

        return courseMapper.selectByExample(example);
    }
}
