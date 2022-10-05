package com.wkr.design.factory.absfac;

/**
 * @Description: 抽象工厂模式测试
 * @date: 2022/10/3 11:44
 * @author: wangkun
 */
public class Test {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        shapeFactory.getShape("cycle").draw();
        shapeFactory.getShape("square").draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        colorFactory.getColor("red").fill();
        colorFactory.getColor("green").fill();
    }
}
