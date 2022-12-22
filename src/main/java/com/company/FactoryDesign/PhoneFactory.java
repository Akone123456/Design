package com.company.FactoryDesign;

/**
 * @author liuxinwei
 * @date 2022/2/28
 */
public class PhoneFactory {
    public static Phone createPhone(String type) {
        Phone phone = null;
        switch (type) {
            case "Apple":
                phone = new ApplePhone();
                break;
            case "HuaWei":
                phone = new HuaWeiPhone();
                break;
            case "Nokia":
                phone = new NokiaPhone();
                break;
        }
        return phone;
    }
}
