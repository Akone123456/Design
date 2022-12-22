package com.company.FactoryMethodDesign;


/**
 * @author liuxinwei
 * @date 2022/2/28
 */
public class NokiaPhone implements  Phone {
    @Override
    public void show() {
        System.out.println("诺基亚手机启动");
    }
}
