package com.wkr.design.composite;

import java.io.File;

/**
 * @author wkr
 * @Description: 文件
 * @date 2022/9/1 11:06
 */
public class FileSystem extends FileSystemNode {
    public FileSystem(String path) {
        super(path);
    }

    @Override
    public int countNumOfFiles() {
        return 1;
    }

    @Override
    public long countSizeOfFiles() {
        File file = new File(path);
        if (file.exists()) {
            return file.length();
        }
        return 0;
    }
}
