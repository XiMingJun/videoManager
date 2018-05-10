package org.lc.video.service;

import org.lc.video.model.Video;

import java.util.List;

public interface IHomeService {


    /**
     * 查询所有的视频
     * */
    List<Video> findAllVideo();
}
