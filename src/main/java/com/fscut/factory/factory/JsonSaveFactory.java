package com.fscut.factory.factory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fscut.factory.AbstractFormatSaver;
import com.fscut.factory.FormatSaveFactory;
import com.fscut.factory.product.JsonSaver;

/**
 * @author liuxinwei
 * @date 2022/12/20 19:33
 */
public class JsonSaveFactory implements FormatSaveFactory {

    public JsonSaveFactory() {
    }

    @Override
    public AbstractFormatSaver createSaver() {
        return new JsonSaver(new ObjectMapper());
    }
}
