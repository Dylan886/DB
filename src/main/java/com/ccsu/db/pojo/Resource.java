package com.ccsu.db.pojo;

// 资源包括但不限于网站显示的课件
public class Resource {
    private Integer id; // 资源id
    private Integer uid;// 上传人
    private String author;// 作者
    private String resourcename;// 资源名称
    private String type;// 资源类型
    private String date; // 上传时间
    private String describe;// 描述
    private Boolean isUsable;// 可用性
    private String url;// 文件路径

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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Boolean getUsable() {
        return isUsable;
    }

    public void setUsable(Boolean usable) {
        isUsable = usable;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "id = " + id +
                "type = " + type +
                "describe = " + describe +
                "date = " + date +
                "author = "+ author +
                "isUsable = " + isUsable +
                "url = " + url;
    }
}
