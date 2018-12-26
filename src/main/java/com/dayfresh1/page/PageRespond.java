package com.dayfresh1.page;

public class PageRespond {

    private int code;
    private String desc;
    private Object obj;

    public PageRespond(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public PageRespond(int code, String desc, Object obj) {
        this.code = code;
        this.desc = desc;
        this.obj = obj;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
