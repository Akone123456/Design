package com.Builder;

import com.Builder.builder.MailBuilder;
import com.Builder.builder.ShortMessageBuilder;
import com.Builder.builder.SiteLetterBuilder;
import com.Builder.product.Mail;
import com.Builder.product.ShortMessage;
import com.Builder.product.SiteLetter;

/**
 * @author liuxinwei
 * @date 2022/12/13 19:33
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("|==> Start ---------------------------------------|");
        // 一封欢迎新用户的站内信
        SiteLetter welcome = new GenericConstructor<>(new SiteLetterBuilder())
                .welcome("system","jack");
        welcome.printSiteMessage();

        // 一条订单超时的短信
        ShortMessage shortMessage = new GenericConstructor<>(new ShortMessageBuilder())
                .orderTimeout("123456","19999999999");
        shortMessage.printShortMessage();

        // 一条物流信息变更的站内信
        SiteLetter logisticsChanged = new GenericConstructor<>(new SiteLetterBuilder())
                .logisticsChanged("system", "tom",
                        "https://on.mall/logistics?id=797e983f-30c0-4ab6-855f-5b24c3f3f543");
        logisticsChanged.printSiteMessage();

        // 一条订单完成的邮件
        Mail mail = new GenericConstructor<>(new MailBuilder())
                .orderCompleted("system@on-mall.com", "67545139@163.com",
                        new Mail.Attachment("a560e36a-31ea.png", 345, null));
        mail.printMail();
    }
}
