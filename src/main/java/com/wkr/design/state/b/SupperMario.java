package com.wkr.design.state.b;

/**
 * @author wkr
 * @Description:
 * @date 2022/9/1916:44
 */
public class SupperMario implements IMario {
    private MarioStateMachine stateMachine;

    public SupperMario(MarioStateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public State getName() {
        return State.SUPPER;
    }

    @Override
    public void obtainMushRoom() {

    }

    @Override
    public void obtainCape() {

    }

    @Override
    public void obtainFireFlower() {

    }

    @Override
    public void meetMonster() {

    }
}
