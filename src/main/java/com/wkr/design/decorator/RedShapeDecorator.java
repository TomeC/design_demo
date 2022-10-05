package com.wkr.design.decorator;

/**
 * @author wkr
 * @Description:
 * @date 2022/9/811:41
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        setRedBorder(shape);
    }
    private void setRedBorder(Shape decoratorShape) {
        System.out.println("red border");
    }
}
