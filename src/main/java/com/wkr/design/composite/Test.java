package com.wkr.design.composite;

/**
 * @author wkr
 * @Description: 组合模式测试
 * @date 2022/9/1 11:17
 */
public class Test {
    public static void main(String[] args) {
        FileSystemNode node = new DirectorySystem("/");
        System.out.println(node.countNumOfFiles());
        System.out.println(node.countSizeOfFiles());
    }
}
