package com.company.project.core.bean.auto;

import java.util.Date;

public class RecordBean {
    private Integer id;

    private String studentId;

    private Integer timeLenth;

    private Integer weekNum;

    private Date createTime;

    private String screenshot;

    public RecordBean(Integer id, String studentId, Integer timeLenth, Integer weekNum, Date createTime, String screenshot) {
        this.id = id;
        this.studentId = studentId;
        this.timeLenth = timeLenth;
        this.weekNum = weekNum;
        this.createTime = createTime;
        this.screenshot = screenshot;
    }

    public RecordBean() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    public Integer getTimeLenth() {
        return timeLenth;
    }

    public void setTimeLenth(Integer timeLenth) {
        this.timeLenth = timeLenth;
    }

    public Integer getWeekNum() {
        return weekNum;
    }

    public void setWeekNum(Integer weekNum) {
        this.weekNum = weekNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getScreenshot() {
        return screenshot;
    }

    public void setScreenshot(String screenshot) {
        this.screenshot = screenshot == null ? null : screenshot.trim();
    }
}