package com.company.FactoryMethodDesign;

/**
 * @author liuxinwei
 * @date 2022/2/28
 */
public interface AbstractPhoneFactory {
    /**
     * 抽象工厂:提供产品的生产方法
     */

    public Phone newPhone();
}
