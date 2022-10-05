package com.wkr.design.state.b;

/**
 * @author wkr
 * @Description:
 * @date 2022/9/1915:40
 */
public interface IMario {
    State getName();
    void obtainMushRoom();
    void obtainCape();
    void obtainFireFlower();
    void meetMonster();
}
