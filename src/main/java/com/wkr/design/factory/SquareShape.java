package com.wkr.design.factory;

import com.wkr.design.factory.Shape;

/**
 * @Description: 圆形
 * @date: 2022/9/30 23:14
 * @author: wangkun
 */
public class SquareShape implements Shape {
    @Override
    public void draw() {
        System.out.println("draw square");
    }
}
