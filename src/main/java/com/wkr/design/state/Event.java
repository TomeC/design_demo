package com.wkr.design.state;

/**
 * @author wkr
 * @Description:
 * @date 2022/9/1910:56
 */
public enum Event {
    EMPTY(0),
    INT(1),
    DECIMAL(2),
    ;
    private int code;

    Event(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
