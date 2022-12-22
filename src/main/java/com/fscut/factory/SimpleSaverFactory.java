package com.fscut.factory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fscut.factory.product.JsonSaver;
import com.fscut.factory.product.XmlSaver;

/**
 * @author liuxinwei
 * @date 2022/12/20 19:18
 */
public class SimpleSaverFactory {
    public static AbstractFormatSaver createFactory(String type) {
        switch (type) {
            case "json":
                return new JsonSaver(new ObjectMapper());
            case "xml":
                return new XmlSaver();
            default:
                throw new RuntimeException("不支持的类型");
        }
    }
}
