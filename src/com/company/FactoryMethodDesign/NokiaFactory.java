package com.company.FactoryMethodDesign;

/**
 * @author liuxinwei
 * @date 2022/2/28
 */
public class NokiaFactory implements  AbstractPhoneFactory{
    @Override
    public Phone newPhone() {
        System.out.println("诺基亚手机工厂生产------->诺基亚手机产品");
        return new NokiaPhone();
    }
}
