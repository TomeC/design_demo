package com.wkr.design.factory.simple;

import com.wkr.design.factory.CycleShape;
import com.wkr.design.factory.Shape;
import com.wkr.design.factory.SquareShape;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wkr
 * @Description:
 * @date 2022/9/514:07
 */
public class Factory2 {
    private static Map<String, Shape> facMap = new HashMap<>();
    static {
        facMap.put("cycle", new CycleShape());
        facMap.put("square", new SquareShape());
    }
    public static Object createObject(String type) {
        return facMap.get(type);
    }
}
