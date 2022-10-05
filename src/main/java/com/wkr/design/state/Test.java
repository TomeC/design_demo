package com.wkr.design.state;

/**
 * @author wkr
 * @Description: 状态模式测试用例
 * @date 2022/9/190:09
 */
public class Test {
    public static void main(String[] args) {
        NumMachine numMachine = new NumMachine();
        System.out.println(numMachine.check(".1"));
    }
}
