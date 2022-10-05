package com.wkr.design.command;

/**
 * @Description: 卖股票类
 * @date: 2022/9/29 23:21
 * @author: wangkun
 */
public class SellStock implements Order {
    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        System.out.println("prepare sell stock");
        stock.sell();
    }
}
