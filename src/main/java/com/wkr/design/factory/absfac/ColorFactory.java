package com.wkr.design.factory.absfac;

import com.wkr.design.factory.Shape;

/**
 * @Description:
 * @date: 2022/10/3 11:42
 * @author: wangkun
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType){
        return null;
    }

    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("red")){
            return new Red();
        } else if(color.equalsIgnoreCase("green")){
            return new Green();
        }
        return null;
    }
}
