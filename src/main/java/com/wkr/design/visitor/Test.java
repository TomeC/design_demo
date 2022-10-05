package com.wkr.design.visitor;

/**
 * @author wkr
 * @Description: 访问者模式[我们使用了一个访问者类，它改变了元素类的执行算法,
 *               元素的执行算法可以随着访问者改变而改变]测试
 * @date 2022/9/2014:59
 */
public class Test {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
