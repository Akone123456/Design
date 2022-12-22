package com.fscut.factory.product;

import com.fscut.factory.AbstractFormatSaver;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.IOException;
import java.io.StringWriter;

/**
 * XML格式存储器
 *
 * @author liuxinwei
 * @date 2022/12/20 18:06
 */
public class XmlSaver extends AbstractFormatSaver {

    public XmlSaver() {
        super(".xml");
    }

    @Override
    public String convert(Object obj) throws Exception {
        System.out.println("    即将开始转换对象为XML格式");
        StringWriter writer = new StringWriter();
        JAXBContext context = JAXBContext.newInstance(obj.getClass());
        Marshaller marshaller = context.createMarshaller();
        // 编码
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
        marshaller.marshal(obj, writer);
        String tar = writer.toString();
        System.out.println("        转换后内容：" + tar);
        return tar;
    }
}
