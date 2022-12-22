package com.company.FactoryMethodDesign;

/**
 * @author liuxinwei
 * @date 2022/2/28
 */
public class AppleFactory implements  AbstractPhoneFactory{
    @Override
    public Phone newPhone() {
        System.out.println("苹果手机工厂生产------->苹果手机产品");
        return new ApplePhone();
    }
}
