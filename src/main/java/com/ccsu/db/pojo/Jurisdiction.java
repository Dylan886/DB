package com.ccsu.db.pojo;

//权限 针对系统的模块进行分权
public class Jurisdiction {
    private Integer id; // id
    private String mode; // 指向具体模块
    private boolean isAvailable;// 是否有权限。 1表示有，0表示没有
    private  Integer uid;// 指向具体用户

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

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "Jurisdiction{" +
                "uid" + uid +
                "mode" + mode +
                "isAvailable" + isAvailable +
                "}";
    }
}
