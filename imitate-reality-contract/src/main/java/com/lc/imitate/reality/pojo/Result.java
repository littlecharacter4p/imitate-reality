package com.lc.imitate.reality.pojo;

import java.io.Serializable;

public class Result<T> implements Serializable{
    private int code;
    private String desc;
    private T data;

    public Result() {
    }

    public Result(int code) {
        this.code = code;
    }

    public Result(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Result(int code, String desc, T data) {
        this.code = code;
        this.desc = desc;
        this.data = data;
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return this.code == CodeEnum.SUCCESS.getCode();
    }

    public boolean isFail() {
        return this.code != CodeEnum.SUCCESS.getCode();
    }

    public enum CodeEnum implements Serializable{
        SUCCESS(0, "成功"),
        FAIL(-1, "失败"),

        SYSTEM_ERROR(1000,"参数错误"),
        PARAMETER_ERROR(1001,"参数错误"),
        PARAMETER_NULL(1002,"参数是空");

        private final int code;
        private final String desc;

        CodeEnum(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public int getCode() {
            return code;
        }

        public String getDesc() {
            return desc;
        }
    }
}
