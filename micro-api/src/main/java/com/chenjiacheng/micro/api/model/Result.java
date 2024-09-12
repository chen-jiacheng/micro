package com.chenjiacheng.micro.api.model;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by chenjiacheng on 2024/9/13 00:51
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@Data
public class Result<T> implements Serializable {

    private String code;
    private String msg;
    private T data;

    public Result() {
    }

    public Result(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> Result<T> ok(T data) {
        return new Result<>("200", "success", data);
    }

    public static <T> Result<T> fail(String code, String msg) {
        return new Result<>(code, msg, null);
    }

}
