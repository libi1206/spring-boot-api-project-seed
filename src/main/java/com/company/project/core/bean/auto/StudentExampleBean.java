package com.company.project.core.bean.auto;

public class StudentExampleBean {
    private String id;

    private String name;

    private String major;

    private Integer level;

    private Boolean delete;

    public StudentExampleBean(String id, String name, String major, Integer level, Boolean delete) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.level = level;
        this.delete = delete;
    }

    public StudentExampleBean() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Boolean getDelete() {
        return delete;
    }

    public void setDelete(Boolean delete) {
        this.delete = delete;
    }
}