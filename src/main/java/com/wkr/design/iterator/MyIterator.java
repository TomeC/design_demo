package com.wkr.design.iterator;

/**
 * @author wkr
 * @Description:
 * @date 2022/9/1917:45
 */
public interface MyIterator<E> {
    boolean hasNext();
    void next();
    E currentItem();
    void remove();
}
