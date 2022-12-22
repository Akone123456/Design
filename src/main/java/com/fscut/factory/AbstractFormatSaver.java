package com.fscut.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

/**
 * 抽象数据格式存储
 *
 * @author liuxinwei
 * @date 2022/12/20 17:20
 */
public abstract class AbstractFormatSaver {

    /**
     * 文件存储格式
     */
    protected final String fileExtension;

    public AbstractFormatSaver(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    /**
     * 格式转换
     *
     * @param obj 原始对象
     * @return 格式化后的字符串
     * @throws Exception Exception
     */
    public abstract String convert(Object obj) throws Exception;

    /**
     * 内容写入文件
     *
     * @param key     键 - 作为文件名
     * @param content 内容
     * @throws IOException
     */
    protected void store(String key, String content) throws IOException {
        System.out.println("    即将开始写入文件");
        String directory = Objects.requireNonNull(this.getClass().getResource("/").getPath());
        String fileName = directory + key + this.fileExtension;
        // 写入文件
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
        }
    }

    /**
     * 转换格式并存储对象
     *
     * @param key 键
     * @param obj 原始对象
     */
    protected void convertAndStore(String key, Object obj) throws Exception {
        String formatContent = this.convert(obj);
        this.store(key,formatContent);
    }
}
