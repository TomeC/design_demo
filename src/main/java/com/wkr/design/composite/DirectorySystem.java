package com.wkr.design.composite;

import java.util.LinkedList;
import java.util.List;

/**
 * @author wkr
 * @Description: 目录
 * @date 2022/9/1 11:09
 */
public class DirectorySystem extends FileSystemNode {
    private List<FileSystemNode> subNodes = new LinkedList<>();
    public DirectorySystem(String path) {
        super(path);
    }

    @Override
    public int countNumOfFiles() {
        int nums = 0;
        for (FileSystemNode node:subNodes) {
            nums += node.countNumOfFiles();
        }
        return nums;
    }

    @Override
    public long countSizeOfFiles() {
        long size = 0;
        for (FileSystemNode node : subNodes) {
            size += node.countSizeOfFiles();
        }
        return size;
    }
}
