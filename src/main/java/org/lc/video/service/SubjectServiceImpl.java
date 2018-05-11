package org.lc.video.service;

import org.lc.video.mapper.SubjectMapper;
import org.lc.video.model.Subject;
import org.lc.video.model.SubjectExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements ISubjectService {

    @Autowired
    private SubjectMapper subjectMapper;


    @Override
    public List<Subject> findAllSubject() {

        SubjectExample example = new SubjectExample();
        SubjectExample.Criteria criteria = example.createCriteria();
        criteria.andDeleteEqualTo(false);

        List<Subject> list = subjectMapper.selectByExample(example);
        return list;
    }
}
