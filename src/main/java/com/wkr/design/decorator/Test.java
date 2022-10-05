package com.wkr.design.decorator;

/**
 * @author wkr
 * @Description: 装饰模式测试
 * @date 2022/9/8 11:33
 */
public class Test {
    public static void main(String[] args) {
        Shape cycle = new CycleShape();
        ShapeDecorator shapeDecorator = new RedShapeDecorator(cycle);
        shapeDecorator.draw();
    }
}
