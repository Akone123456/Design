package com.company.FactoryMethodDesign;

/**
 * @author liuxinwei
 * @date 2022/2/28
 */
public class HuaWeiPhoneFactory implements  AbstractPhoneFactory{
    @Override
    public Phone newPhone() {
        System.out.println("华为手机工厂生产------->华为手机产品");
        return new HuaWeiPhone();
    }
}
