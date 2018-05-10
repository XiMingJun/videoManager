package org.lc.video.service;

import org.lc.video.model.Teacher;

import java.util.List;

/**
 * 处理讲师业务
 * */
public interface ITeacherService {

    /**
     * 查询所有的讲师
     * */
    List<Teacher> findAllTeacher();

}
