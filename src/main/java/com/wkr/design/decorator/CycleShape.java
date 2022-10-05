package com.wkr.design.decorator;

/**
 * @author wkr
 * @Description:
 * @date 2022/9/811:30
 */
public class CycleShape implements Shape {
    @Override
    public void draw() {
        System.out.println("draw cycle");
    }
}
