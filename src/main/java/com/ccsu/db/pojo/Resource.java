package com.ccsu.db.pojo;

public class Resource {
    private Integer id;

    private Integer uid;

    private String author;

    private String resourcename;

    private String type;

    private String date;

    private String desrcibe;

    private String isusable;

    private String url;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getResourcename() {
        return resourcename;
    }

    public void setResourcename(String resourcename) {
        this.resourcename = resourcename;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDesrcibe() {
        return desrcibe;
    }

    public void setDesrcibe(String desrcibe) {
        this.desrcibe = desrcibe;
    }

    public String getIsusable() {
        return isusable;
    }

    public void setIsusable(String isusable) {
        this.isusable = isusable;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}