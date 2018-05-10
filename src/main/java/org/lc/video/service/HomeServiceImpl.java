package org.lc.video.service;

import org.lc.video.mapper.IVideoMapper;
import org.lc.video.model.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeServiceImpl implements IHomeService {


    @Autowired
    private IVideoMapper videoMapper;

    @Override
    public List<Video> findAllVideo() {

        return videoMapper.selectAllVideo();
    }
}
