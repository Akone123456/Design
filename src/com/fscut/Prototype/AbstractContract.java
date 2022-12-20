package com.fscut.Prototype;

/**
 * @author liuxinwei
 * @date 2022/12/9 9:54
 */
public abstract class AbstractContract implements Cloneable {

    /**
     * 合同类型
     */
    private String type;

    /**
     * 买房
     */
    private String buyer;

    /**
     * 中间商
     */
    private String mediator = "不靠谱中间商";

    /**
     * 卖方
     */
    private String seller;

    public AbstractContract(String type) {
        this.type = type;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    /**
     * 签署合同
     *
     * @param productOwner 商品归属方
     * @param other        另一方
     */
    public abstract void signed(String productOwner, String other);

    @Override
    protected AbstractContract clone() throws CloneNotSupportedException {
        try {
            AbstractContract clone = (AbstractContract) super.clone();
            System.out.println("    复印了一份房屋" + this.type);
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
