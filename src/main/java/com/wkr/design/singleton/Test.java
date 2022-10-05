package com.wkr.design.singleton;

/**
 * @author wkr
 * @Description: 单例模式测试
 * @date 2022/9/218:50
 */
public class Test {
    public static void main(String[] args) {
//        singleton1Test();
//        singleton2Test();
//        singleton3Test();
//        singleton4Test();
        singleton5Test();
    }
    private static void singleton1Test() {
        System.out.println(Singleton1.instance.getResource());
        System.out.println(Singleton1.instance.getResource());
        System.out.println(Singleton1.instance.getResource());
        System.out.println(Singleton1.instance.getResource());
    }
    private static void singleton2Test() {
        System.out.println(Singleton2.getInstance().getResource());
        System.out.println(Singleton2.getInstance().getResource());
        System.out.println(Singleton2.getInstance().getResource());
        System.out.println(Singleton2.getInstance().getResource());
    }
    private static void singleton3Test() {
        System.out.println(Singleton3.getInstance().getResource());
        System.out.println(Singleton3.getInstance().getResource());
        System.out.println(Singleton3.getInstance().getResource());
        System.out.println(Singleton3.getInstance().getResource());
    }
    private static void singleton4Test() {
        System.out.println(Singleton4.Holder.instace.getResource());
        System.out.println(Singleton4.Holder.instace.getResource());
        System.out.println(Singleton4.Holder.instace.getResource());
    }

    private static void singleton5Test() {
        System.out.println(Singleton5.INSTANCE.getResource());
        System.out.println(Singleton5.INSTANCE.getResource());
        System.out.println(Singleton5.INSTANCE.getResource());
    }
}
