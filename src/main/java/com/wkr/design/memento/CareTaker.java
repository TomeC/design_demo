package com.wkr.design.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @date: 2022/10/3 15:37
 * @author: wangkun
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
