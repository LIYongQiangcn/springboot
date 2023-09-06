package com.example.reponse;

import java.io.Serializable;

public class BaseResponse<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private static final int SUCCESS_CODE = 200;
    private static final int ERROR_CODE = 500;
    private static final String SUCCESS_MSG = "success";
    private static final String ERROR_MSG = "error";

    private int code;
    private String msg;
    private Long time;
    private boolean success;
    private T data;

    public BaseResponse() {
        this.time = System.currentTimeMillis();
    }

    public BaseResponse(int code, String msg, boolean success, T data) {
        this.code = code;
        this.msg = msg;
        this.success = success;
        this.time = System.currentTimeMillis();
    }

    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse(SUCCESS_CODE, SUCCESS_MSG, true, data);
    }

    public static <T> BaseResponse<T> success() {
        return new BaseResponse(SUCCESS_CODE, SUCCESS_MSG, true, null);
    }

    public static <T> BaseResponse<T> error(String msg) {
        return new BaseResponse(ERROR_CODE, msg , false, null);
    }

    public static <T> BaseResponse<T> error( ) {
        return new BaseResponse(ERROR_CODE, ERROR_MSG, false, null);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }



}
