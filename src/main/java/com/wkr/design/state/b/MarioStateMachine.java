package com.wkr.design.state.b;

/**
 * @author wkr
 * @Description:
 * @date 2022/9/1916:03
 */
public class MarioStateMachine {
    private int score;
    private IMario currentState;

    public MarioStateMachine() {
        this.score = 0;
        this.currentState = new SmallMario(this);
    }

    public void obtainMushRoom() {
        currentState.obtainMushRoom();
    }
    public void obtainCape() {
        currentState.obtainCape();
    }
    public void obtainFireFlower() {
        currentState.obtainFireFlower();
    }
    public void meetMonster() {
        currentState.meetMonster();
    }
    public int getScore() {
        return score;
    }
    public State getCurrentState() {
        return currentState.getName();
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setCurrentState(IMario currentState) {
        this.currentState = currentState;
    }
}
