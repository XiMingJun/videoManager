package org.lc.video.service;

import org.lc.video.mapper.VideoMapper;
import org.lc.video.model.Video;
import org.lc.video.model.VideoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImpl implements IVideoService {


    @Autowired
    private VideoMapper videoMapper;

    @Override
    public List<Video> findAllVideo() {

        VideoExample example = new VideoExample();
        VideoExample.Criteria criteria = example.createCriteria();
        criteria.andDeleteEqualTo(false);

        return videoMapper.selectByExample(example);
    }

    @Override
    public int saveVideo(Video video) {

       return videoMapper.insertSelective(video);

    }

    @Override
    public int deleteVideo(Video video) {

        video.setDelete(true);

        return videoMapper.updateByPrimaryKeySelective(video);
    }

    @Override
    public int updateVideo(Video video) {

        return videoMapper.updateByPrimaryKeySelective(video);
    }

    @Override
    public List<Video> findVideo(String title, String teacherId, String courseId) {


        VideoExample example = new VideoExample();
        VideoExample.Criteria criteria = example.createCriteria();
        if (title != null){

            criteria.andTitleLike("%"+title+"%");
        }
        if (teacherId != null){
            criteria.andTeacherIdEqualTo(Long.valueOf(teacherId));
        }
        if (courseId != null){
            criteria.andCourseIdEqualTo(Long.valueOf(courseId));
        }

        criteria.andDeleteEqualTo(false);

        return videoMapper.selectByExample(example);
    }
}
