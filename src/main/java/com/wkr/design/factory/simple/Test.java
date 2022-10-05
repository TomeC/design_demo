package com.wkr.design.factory.simple;

import com.wkr.design.factory.Shape;

/**
 * @author wkr
 * @Description: 工厂模式测试
 * @date 2022/9/511:36
 */
public class Test {
    public static void main(String[] args) {
        //工厂模式测试
        Shape cycle = Factory1.createObject("cycle");
        cycle.draw();
        Shape square = Factory1.createObject("square");
        square.draw();
    }
}
