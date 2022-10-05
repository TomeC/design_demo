package com.wkr.design.Flyweight;

/**
 * @author wkr
 * @Description: 享元模式测试
 * @date 2022/9/111:30
 */
public class Test {
    public static void main(String[] args) {
        IntCache i1 = IntCache.imap.get(1000);
        IntCache i2 = IntCache.imap.get(1000);
        System.out.println(i1==i2);
    }
}
