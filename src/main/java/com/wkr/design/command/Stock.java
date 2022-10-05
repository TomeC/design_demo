package com.wkr.design.command;

/**
 * @Description: 股票类
 * @date: 2022/9/29 23:16
 * @author: wangkun
 */
public class Stock {
    private String name = "sina";
    private int quantity = 10;
    public void sell() {
        System.out.println("sell stck "+name+":"+quantity);
    }
    public void buy() {
        System.out.println("buy stck "+name+":"+quantity);
    }
}
