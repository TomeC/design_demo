package com.wkr.design.state.b;

/**
 * @author wkr
 * @Description:
 * @date 2022/9/1915:54
 */
public enum State {
    // 初始马里奥 可变化到其他3种
    SMALL(0),
    // 超级马里奥 可变化到其他3种
    SUPPER(1),
    // 火焰马里奥 可变小
    FIRE(2),
    // 斗篷马里奥 可变小
    CAPE(3),

    ;
    private int value;

    State(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
