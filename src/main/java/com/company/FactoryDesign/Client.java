package com.company.FactoryDesign;

/**
 * @author liuxinwei
 * @date 2022/2/28
 */
public class Client {
    public static void main(String[] args) {
        PhoneFactory.createPhone("HuaWei").show();
        PhoneFactory.createPhone("Nokia").show();
        PhoneFactory.createPhone("Apple").show();
    }
}
