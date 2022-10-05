package com.wkr.design.factory.absfac;

import com.wkr.design.factory.CycleShape;
import com.wkr.design.factory.Shape;
import com.wkr.design.factory.SquareShape;

/**
 * @Description:
 * @date: 2022/10/3 11:40
 * @author: wangkun
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("cycle")){
            return new CycleShape();
        }  else if(shapeType.equalsIgnoreCase("square")){
            return new SquareShape();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
