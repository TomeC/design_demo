package com.wkr.design.command;

import java.util.LinkedList;
import java.util.List;

/**
 * @Description: 经纪人类
 * @date: 2022/9/29 23:22
 * @author: wangkun
 */
public class Broker {
    private List<Order> orderList = new LinkedList<>();
    public void takeOrder(Order order) {
        System.out.println("receive command");
        orderList.add(order);
    }
    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
