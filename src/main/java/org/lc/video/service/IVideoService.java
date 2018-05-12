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

    /**
     * 添加视频信息
     * */
    int saveVideo(Video video);

    /**
     * 删除视频信息
     * */
    int deleteVideo(Video video);

    /**
     * 更新视频信息
     * */
    int updateVideo(Video video);

    /**
     * 搜索满足条件的视频列表
     * */
    List<Video> findVideo(String title,String teacherId,String courseId);


}
