package com.wkr.design.composite;

/**
 * @author wkr
 * @Description: 文件系统节点抽象类
 * @date 2022/9/1 11:04
 */
public abstract class FileSystemNode {
    protected String path;

    public FileSystemNode(String path) {
        this.path = path;
    }

    public abstract int countNumOfFiles();
    public abstract long countSizeOfFiles();
    public String getPath() {
        return path;
    }
}
