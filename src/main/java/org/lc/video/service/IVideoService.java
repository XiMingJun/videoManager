package org.lc.video.service;


import org.lc.video.model.Video;

import java.util.List;

/**
 * 处理所有的视频业务
 * */
public interface IVideoService {

    /**
     * 查询所有的视频
     * */
    List<Video> findAllVideo();

}
