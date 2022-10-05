package com.wkr.design.template;

/**
 * @author wkr
 * @Description: 模板模式
 * @date 2022/9/11 23:59
 */
public class Test {
    public static void main(String[] args) {
        Product product = new ConcreteProduct();
        product.generate();
    }
}
