package com.wkr.design.visitor;

/**
 * @Description:
 * @date: 2022/10/5 21:37
 * @author: wangkun
 */
public class Keyboard implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}