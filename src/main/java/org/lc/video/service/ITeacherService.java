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


    /**
     * 保存讲师信息
     * */
    int saveTeacher(Teacher teacher);

    /**
     * 更新讲师信息
     * */
    int updateTeacher(Teacher teacher);

    /**
     * 删除讲师信息
     * */
    int deleteTeacher(String teacherId);

    /**
     * 搜索满足条件的讲师
     * */
    List<Teacher> findTeacher(String name,String gender);

}
