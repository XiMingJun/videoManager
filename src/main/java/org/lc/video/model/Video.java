package org.lc.video.model;

import java.util.Date;

public class Video {

    /**视频ID*/
    private Integer videoId;
    /**课程ID*/
    private Integer courseId;
    /**讲师ID*/
    private Integer teacherId;
    /**添加视频的管理员ID*/
    private Integer createUserId;
    /**标题*/
    private String title;
    /**描述*/
    private String description;
    /**视频地址*/
//    private String videoAddress;
    /**视频地址*/
    private String video_address;
    /**视频封面地址*/
    private String cover;
    /**是否删除 0 未删除，1 已删除*/
    private boolean delete;
    /**视频大小*/
    private double videoLength;
    /**添加时间*/
    private Date gmtCreate;
    /**上次修改时间*/
    private Date gmtUpdate;


    public Video() {
    }

    public Video(Integer videoId, Integer courseId, Integer teacherId, String title, String description, String video_address, String cover) {
        this.videoId = videoId;
        this.courseId = courseId;
        this.teacherId = teacherId;
        this.title = title;
        this.description = description;
        this.video_address = video_address;
        this.cover = cover;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }


    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getVideo_address() {
        return video_address;
    }

    public void setVideo_address(String video_address) {
        this.video_address = video_address;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public boolean isDelete() {
        return delete;
    }

    public void setDelete(boolean delete) {
        this.delete = delete;
    }

    public double getVideoLength() {
        return videoLength;
    }

    public void setVideoLength(double videoLength) {
        this.videoLength = videoLength;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtUpdate() {
        return gmtUpdate;
    }

    public void setGmtUpdate(Date gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
    }

    @Override
    public String toString() {
        return "Video{" +
                "videoId=" + videoId +
                ", courseId=" + courseId +
                ", teacherId=" + teacherId +
                ", createUserId=" + createUserId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", video_address='" + video_address + '\'' +
                ", cover='" + cover + '\'' +
                ", delete=" + delete +
                ", videoLength=" + videoLength +
                ", gmtCreate=" + gmtCreate +
                ", gmtUpdate=" + gmtUpdate +
                '}';
    }
}
