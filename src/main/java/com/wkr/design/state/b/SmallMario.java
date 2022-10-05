package com.wkr.design.state.b;

/**
 * @author wkr
 * @Description:
 * @date 2022/9/1916:01
 */
public class SmallMario implements IMario {
    private MarioStateMachine stateMachine;

    public SmallMario(MarioStateMachine marioStateMachine) {
        this.stateMachine = marioStateMachine;
    }

    @Override
    public State getName() {
        return State.SMALL;
    }

    @Override
    public void obtainMushRoom() {
        stateMachine.setCurrentState(new SupperMario(stateMachine));
        stateMachine.setScore(stateMachine.getScore()+100);
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
