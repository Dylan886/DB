package com.ccsu.db.pojo;

public class Jurisdiction {
    private Integer id;

    private String mode;

    private String isavailable;

    private Integer uid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getIsavailable() {
        return isavailable;
    }

    public void setIsavailable(String isavailable) {
        this.isavailable = isavailable;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}