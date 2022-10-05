package com.wkr.design.factory.simple;

import com.wkr.design.factory.CycleShape;
import com.wkr.design.factory.Shape;
import com.wkr.design.factory.SquareShape;

/**
 * @author wkr
 * @Description: 简单工厂1
 * @date 2022/9/513:51
 */
public class Factory1 {
    public static Shape createObject(String type) {
        if ("cycle".equals(type)) {
            return new CycleShape();
        } else if ("square".equals(type)) {
            return new SquareShape();
        }
        return null;
    }
}
