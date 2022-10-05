package com.wkr.design.decorator;

/**
 * @author wkr
 * @Description:
 * @date 2022/9/811:31
 */
public class RectangleShape implements Shape {
    @Override
    public void draw() {
        System.out.println("draw rectangle");
    }
}
