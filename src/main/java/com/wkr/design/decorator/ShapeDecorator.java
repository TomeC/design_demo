package com.wkr.design.decorator;

/**
 * @author wkr
 * @Description: 装饰类
 * @date 2022/9/811:32
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
