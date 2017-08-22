package com.xiong.www.exception;

public class CustomException extends Exception {
    /*
    * 自定义异常类
    * */
    private String message;

    public CustomException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
