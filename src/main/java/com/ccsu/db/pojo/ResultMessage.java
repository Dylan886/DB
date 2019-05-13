package com.ccsu.db.pojo;
// 保存程序的运行结果，错误等
public class ResultMessage {
    // 错误代码
    private Integer errcode;
    // 错误信息
    private String errmsg;
    // 输出信息
    private Object data;


    public ResultMessage() {
        this.errcode = 0;
        this.errmsg = null;
        this.data = null;
    }

    public ResultMessage(Integer errcode, String errmsg) {
        this.errcode = errcode;
        this.errmsg = errmsg;
    }

    public ResultMessage(Integer errcode, String errmsg, Object data) {
        this.errcode = errcode;
        this.errmsg = errmsg;
        this.data = data;
    }


    public Integer getErrcode() {
        return errcode;
    }

    public void setErrcode(Integer errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
