package com.fscut.Prototype.contract;

import com.fscut.Prototype.AbstractContract;

/**
 * @author liuxinwei
 * @date 2022/12/9 10:02
 */
public class SalesContract extends AbstractContract {
    public SalesContract() {
        super("买卖合同");
    }

    @Override
    public void signed(String productOwner, String other) {
        this.setBuyer(other);
        this.setSeller(productOwner);
        System.out.println("    房屋买方为：" + other);
        System.out.println("    房屋出售方为：" + productOwner);
    }
}
