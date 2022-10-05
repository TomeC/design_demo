package com.wkr.design.state.b;

/**
 * @author wkr
 * @Description:
 * @date 2022/9/1915:59
 */
public class Test {
    public static void main(String[] args) {
        MarioStateMachine stateMachine = new MarioStateMachine();
        System.out.println(stateMachine.getCurrentState()+":"+stateMachine.getScore());
        stateMachine.obtainMushRoom();
        System.out.println(stateMachine.getCurrentState()+":"+stateMachine.getScore());
    }
}
