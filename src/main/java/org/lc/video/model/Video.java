package org.lc.video.model;

import java.util.Date;

public class Video {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video.video_id
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    private Long videoId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video.course_id
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    private Long courseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video.teacher_id
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    private Long teacherId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video.title
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video.video_length
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    private Integer videoLength;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video.cover
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    private String cover;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video.video_address
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    private String videoAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video.description
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video.gmt_create
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video.create_userId
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    private Long createUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video.gmt_update
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    private Date gmtUpdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video.is_delete
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    private Boolean delete;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video.video_id
     *
     * @return the value of video.video_id
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public Long getVideoId() {
        return videoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video.video_id
     *
     * @param videoId the value for video.video_id
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public void setVideoId(Long videoId) {
        this.videoId = videoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video.course_id
     *
     * @return the value of video.course_id
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public Long getCourseId() {
        return courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video.course_id
     *
     * @param courseId the value for video.course_id
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video.teacher_id
     *
     * @return the value of video.teacher_id
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public Long getTeacherId() {
        return teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video.teacher_id
     *
     * @param teacherId the value for video.teacher_id
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video.title
     *
     * @return the value of video.title
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video.title
     *
     * @param title the value for video.title
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video.video_length
     *
     * @return the value of video.video_length
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public Integer getVideoLength() {
        return videoLength;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video.video_length
     *
     * @param videoLength the value for video.video_length
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public void setVideoLength(Integer videoLength) {
        this.videoLength = videoLength;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video.cover
     *
     * @return the value of video.cover
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public String getCover() {
        return cover;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video.cover
     *
     * @param cover the value for video.cover
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video.video_address
     *
     * @return the value of video.video_address
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public String getVideoAddress() {
        return videoAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video.video_address
     *
     * @param videoAddress the value for video.video_address
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public void setVideoAddress(String videoAddress) {
        this.videoAddress = videoAddress == null ? null : videoAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video.description
     *
     * @return the value of video.description
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video.description
     *
     * @param description the value for video.description
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video.gmt_create
     *
     * @return the value of video.gmt_create
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video.gmt_create
     *
     * @param gmtCreate the value for video.gmt_create
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video.create_userId
     *
     * @return the value of video.create_userId
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public Long getCreateUserId() {
        return createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video.create_userId
     *
     * @param createUserId the value for video.create_userId
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video.gmt_update
     *
     * @return the value of video.gmt_update
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public Date getGmtUpdate() {
        return gmtUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video.gmt_update
     *
     * @param gmtUpdate the value for video.gmt_update
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public void setGmtUpdate(Date gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video.is_delete
     *
     * @return the value of video.is_delete
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public Boolean getDelete() {
        return delete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video.is_delete
     *
     * @param delete the value for video.is_delete
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public void setDelete(Boolean delete) {
        this.delete = delete;
    }
}