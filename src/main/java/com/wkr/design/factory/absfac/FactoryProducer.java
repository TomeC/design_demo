package com.wkr.design.factory.absfac;

/**
 * @Description:
 * @date: 2022/10/3 11:42
 * @author: wangkun
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("shape")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("color")){
            return new ColorFactory();
        }
        return null;
    }
}
