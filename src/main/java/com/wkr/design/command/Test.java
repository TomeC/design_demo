package com.wkr.design.command;

/**
 * @author wkr
 * @Description: 命令模式【把函数封装成对象，存储下来方便后续控制执行】
 * @date 2022/9/20 14:58
 */
public class Test {
    public static void main(String[] args) {
        Stock stock = new Stock();
        BuyStock buyStock = new BuyStock(stock);
        BuyStock buyStock2 = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);
        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(buyStock2);
        broker.takeOrder(sellStock);
        broker.placeOrders();
    }
}
