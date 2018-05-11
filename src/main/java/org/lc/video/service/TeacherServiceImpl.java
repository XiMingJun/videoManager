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

    @Override
    public int saveTeacher(Teacher teacher) {

      return  teacherMapper.insertSelective(teacher);
    }

    @Override
    public int updateTeacher(Teacher teacher) {

       return teacherMapper.updateByPrimaryKeySelective(teacher);

    }

    @Override
    public int deleteTeacher(String teacherId) {

        Teacher teacher = new Teacher();
        teacher.setTeacherId(Long.valueOf(teacherId));
        teacher.setDelete(true);

        return teacherMapper.updateByPrimaryKeySelective(teacher);
    }

    @Override
    public List<Teacher> findTeacher(String name, String gender) {

        TeacherExample example = new TeacherExample();
        TeacherExample.Criteria criteria = example.createCriteria();

        if (name != null){
            criteria.andNameLike(String.format("%%s%%",name));
        }
        if (gender != null){
            if (gender.equals("1"))criteria.andGenderEqualTo(true);
            if (gender.equals("0"))criteria.andGenderEqualTo(false);
            
        }
        criteria.andDeleteEqualTo(false);

        return teacherMapper.selectByExample(example);
    }
}
