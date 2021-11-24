package com.zxs.user.common.resp;

/**
 *
 */
public enum RestResultCode {

    // 通用错误码
    ERR_SUCCESS(10000, "OK"),
    ERR_OTHER(10001, "Error")
    ;

    private int code;
    private String msg;

    RestResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }
}
