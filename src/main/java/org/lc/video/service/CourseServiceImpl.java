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
}
