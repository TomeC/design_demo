package com.wkr.design.factory.absfac;

/**
 * @Description:
 * @date: 2022/10/3 11:39
 * @author: wangkun
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
