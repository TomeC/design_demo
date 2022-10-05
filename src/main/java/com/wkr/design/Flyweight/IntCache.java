package com.wkr.design.Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wkr
 * @Description:
 * @date 2022/9/111:27
 */
public class IntCache {
    private int i;
    public static final Map<Integer, IntCache> imap = new HashMap<>();
    static {
        imap.put(1000, new IntCache(1000));
        imap.put(1001, new IntCache(1001));
        imap.put(1002, new IntCache(1002));
    }

    public IntCache(int i) {
        this.i = i;
    }
}
