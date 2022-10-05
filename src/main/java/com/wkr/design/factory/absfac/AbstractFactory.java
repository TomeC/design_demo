package com.wkr.design.factory.absfac;

import com.wkr.design.factory.Shape;

/**
 * @Description:
 * @date: 2022/10/3 11:39
 * @author: wangkun
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
