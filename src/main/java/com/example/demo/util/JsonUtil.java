package com.example.demo.util;

import java.io.Serializable;

/**
 * @ClassName JsonUtil
 * @Description TODO
 * @Author lizhitao
 * @Data 2020/6/6 23:19
 * @Version 1.0
 **/
public class JsonUtil implements Serializable{

    private int code;
    private Object data;
    private String msg;

    public JsonUtil() {
    }

    public JsonUtil(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public static JsonUtil JsonSuccess(Object data){
        return new JsonUtil(0,data,"");
    }

    public static JsonUtil JsonError(String data){
        return new JsonUtil(-1,"",data);
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
