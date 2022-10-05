package com.wkr.design.visitor;

/**
 * @Description:
 * @date: 2022/10/4 0:18
 * @author: wangkun
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
