package com.wkr.design.prototype;

import java.io.*;

/**
 * @author wkr
 * @Description:
 * @date 2022/9/519:21
 */
public class ProtoDemo implements Serializable {
    private int a = 1;
    private String s = "hello";
    private Double d = Double.valueOf("123.4567921923");

    @Override
    public String toString() {
        return "ProtoDemo{" +
                "a=" + a +
                ", s='" + s + '\'' +
                ", d=" + d +
                '}';
    }

    public Object deepCopy() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        oo.writeObject(this);

        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);
        return oi.readObject();
    }
}
