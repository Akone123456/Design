package com.fscut.factory.factory;

import com.fscut.factory.AbstractFormatSaver;
import com.fscut.factory.FormatSaveFactory;
import com.fscut.factory.SimpleSaverFactory;
import com.fscut.factory.product.XmlSaver;

/**
 * @author liuxinwei
 * @date 2022/12/20 19:34
 */
public class XmlSaveFactory implements FormatSaveFactory {

    public XmlSaveFactory() {
    }

    @Override
    public AbstractFormatSaver createSaver() {
        return new XmlSaver();
    }
}
