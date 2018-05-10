package org.lc.video.service;

import org.lc.video.model.Course;

import java.util.List;

public interface ICourseService {

    /**
     * 查询所有的课程
     * */
    List<Course> findAllCourse();
}
