package com.wkr.design.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * @author wkr
 * @Description:
 * @date 2022/9/1917:44
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4));


        MyIterator<Integer> iter = new ArrayIterator<>(arr);
        while (iter.hasNext()) {
            System.out.println(iter.currentItem());
            iter.next();
        }

    }
}
