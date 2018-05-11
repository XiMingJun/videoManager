package org.lc.video.service;

import org.lc.video.model.Subject;

import java.util.List;

public interface ISubjectService  {


    /**
     * 查询所有的学科
     * */
     List<Subject> findAllSubject();
}
