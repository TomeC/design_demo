package com.wkr.design.factory.absfac;

/**
 * @Description:
 * @date: 2022/10/3 11:38
 * @author: wangkun
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}