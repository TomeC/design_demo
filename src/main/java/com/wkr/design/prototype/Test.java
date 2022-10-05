package com.wkr.design.prototype;

import java.io.IOException;

/**
 * @author wkr
 * @Description:
 * @date 2022/9/519:28
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ProtoDemo demo = new ProtoDemo();
        System.out.println(demo.deepCopy());
    }
}
