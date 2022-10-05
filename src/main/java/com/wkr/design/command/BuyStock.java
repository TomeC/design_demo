package com.wkr.design.command;

/**
 * @Description: 购买类
 * @date: 2022/9/29 23:19
 * @author: wangkun
 */
public class BuyStock implements Order {
    private Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        System.out.println("prepare buy stock");
        stock.buy();
    }
}
