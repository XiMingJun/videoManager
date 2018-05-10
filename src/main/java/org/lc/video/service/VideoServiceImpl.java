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
}
