package org.lc.video.service;

import org.lc.video.mapper.TeacherMapper;
import org.lc.video.model.Teacher;
import org.lc.video.model.TeacherExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements ITeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public List<Teacher> findAllTeacher() {

        TeacherExample example = new TeacherExample();
        TeacherExample.Criteria criteria = example.createCriteria();
        criteria.andDeleteEqualTo(false);
        return teacherMapper.selectByExample(example);
    }
}
