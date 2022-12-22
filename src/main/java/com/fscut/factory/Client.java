package com.fscut.factory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fscut.factory.factory.JsonSaveFactory;
import com.fscut.factory.factory.XmlSaveFactory;
import com.fscut.factory.product.JsonSaver;
import com.fscut.factory.product.XmlSaver;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liuxinwei
 * @date 2022/12/20 18:15
 */
public class Client {
    public static void main(String[] args) throws Exception {
        DTO dto = new DTO();
        dto.setName("Jack");
        dto.setAge(23);
//        System.out.println("|==> Start ---------------------------------------------------------------|");
//        AbstractFormatSaver jsonSaver = new JsonSaver(new ObjectMapper());
//        jsonSaver.convertAndStore("Jack_json", dto);
//
//        AbstractFormatSaver xmlSaver = new XmlSaver();
//        xmlSaver.convertAndStore("Jack_xml", dto);


        AbstractFormatSaver jsonSaver = new JsonSaveFactory().createSaver();
        jsonSaver.convertAndStore("jack_json",dto);

        AbstractFormatSaver xmlSaver = new XmlSaveFactory().createSaver();
        xmlSaver.convertAndStore("jack_xml",dto);


//        AbstractFormatSaver factory = SimpleSaverFactory.createFactory("json");
//        factory.convertAndStore("key",dto);
    }
}
