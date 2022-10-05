package com.wkr.design.visitor;

/**
 * @Description:
 * @date: 2022/10/4 0:19
 * @author: wangkun
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
