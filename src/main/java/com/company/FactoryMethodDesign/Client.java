package com.company.FactoryMethodDesign;

/**
 * @author liuxinwei
 * @date 2022/2/28
 */
public class Client {

    public static void main(String[] args) {
        AbstractPhoneFactory abstractPhoneFactory = new AppleFactory();
        Phone applePhone = abstractPhoneFactory.newPhone();
        applePhone.show();


    }
}
