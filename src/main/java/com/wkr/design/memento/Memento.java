package com.wkr.design.memento;

/**
 * @Description:
 * @date: 2022/10/3 15:36
 * @author: wangkun
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
