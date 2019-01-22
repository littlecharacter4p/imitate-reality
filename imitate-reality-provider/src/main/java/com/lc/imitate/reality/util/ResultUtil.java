package com.lc.imitate.reality.util;


import com.lc.imitate.reality.pojo.Result;

public class ResultUtil {
    public static <T> Result<T> success() {
        return new Result<>(Result.CodeEnum.SUCCESS.getCode(), Result.CodeEnum.SUCCESS.getDesc(), null);
    }

    public static <T> Result<T> success(T data) {
        return new Result<>(Result.CodeEnum.SUCCESS.getCode(), Result.CodeEnum.SUCCESS.getDesc(), data);
    }

    public static <T> Result<T> fail() {
        return new Result<>(Result.CodeEnum.FAIL.getCode(), Result.CodeEnum.FAIL.getDesc(), null);
    }

    public static <T> Result<T> fail(String desc) {
        return new Result<>(Result.CodeEnum.FAIL.getCode(), desc, null);
    }

    public static <T> Result<T> fail(String desc, T data) {
        return new Result<>(Result.CodeEnum.FAIL.getCode(), desc, data);
    }

    public static <T> Result<T> fail(Result.CodeEnum codeEnum) {
        return new Result<>(codeEnum.getCode(), codeEnum.getDesc(), null);
    }

    public static <T> Result<T> fail(Result.CodeEnum codeEnum, T data) {
        return new Result<>(codeEnum.getCode(), codeEnum.getDesc(), data);
    }
}
