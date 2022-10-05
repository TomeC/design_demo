package com.wkr.design.visitor;

/**
 * @Description:
 * @date: 2022/10/5 21:43
 * @author: wangkun
 */
public class Monitor implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}