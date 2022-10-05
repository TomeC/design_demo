package com.wkr.design.iterator;

import java.util.ArrayList;

/**
 * @author wkr
 * @Description:
 * @date 2022/9/1919:24
 */
public class ArrayIterator<E> implements MyIterator<E> {
    private int cursor;
    // 检测对象是否有改动
    private int expectModCount;
    private ArrayList<E> arrayList;

    public ArrayIterator(ArrayList<E> arrayList) {
        cursor = 0;
        this.arrayList = arrayList;
        expectModCount = arrayList.size();
    }

    @Override
    public boolean hasNext() {
        return cursor != arrayList.size();
    }

    @Override
    public void next() {
        cursor++;
    }

    @Override
    public E currentItem() {
        if (cursor >= arrayList.size()) {
            throw new IndexOutOfBoundsException();
        }
        return arrayList.get(cursor);
    }

    @Override
    public void remove() {

    }
}
