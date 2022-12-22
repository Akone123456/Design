package com.fscut.factory.product;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fscut.factory.AbstractFormatSaver;

import java.io.IOException;

/**
 * Json格式存储器
 *
 * @author liuxinwei
 * @date 2022/12/20 17:52
 */
public class JsonSaver extends AbstractFormatSaver {

    private final ObjectMapper objectMapper;

    public JsonSaver(ObjectMapper objectMapper) {
        super(".json");
        this.objectMapper = objectMapper;
    }

    @Override
    public String convert(Object obj) throws Exception {
        System.out.println("    即将开始转换对象为JSON格式");
        String tar = objectMapper.writeValueAsString(obj);
        System.out.println("        转换后内容：" + tar);
        return tar;
    }
}
