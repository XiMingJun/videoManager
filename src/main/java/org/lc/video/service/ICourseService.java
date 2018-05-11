package org.lc.video.service;

import org.lc.video.model.Course;

import java.util.List;

public interface ICourseService {

    /**
     * 查询所有的课程
     * */
    List<Course> findAllCourse();

    /**
     * 保存视频
     * */
    Course saveCourse(Course course);

    /**
     * 更新视频
     * */
    Course updateCourse(Course course);

    /**
     * 删除视频
     * */
    int deleteCourse(String courseId);

    /**
     * 搜索满足条件的课程
     * */
    List<Course> findCourse(String title,String subjectId);


}
