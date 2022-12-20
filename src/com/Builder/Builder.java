package com.Builder;

import com.Builder.product.Mail;

import java.util.concurrent.TimeUnit;

/**
 * @author liuxinwei
 * @date 2022/12/13 18:51
 */
public interface Builder<T> {
    /**
     * 设置通知发信人
     *
     * @param sender
     */
    void buildSender(String sender);

    /**
     * 设置通知收信人
     *
     * @param recipient
     */
    void buildRecipient(String recipient);

    /**
     * 添加抄送人
     *
     * @param cc
     */
    void addCc(String cc);

    /**
     * 设置主题
     *
     * @param theme
     */
    void buildTheme(String theme);

    /**
     * 设置正文
     *
     * @param body
     */
    void buildBody(String body);

    /**
     * 设置链接
     *
     * @param link
     */
    void buildLink(String link);

    /**
     * 添加附件
     *
     * @param attachment
     */
    void addAttachment(Mail.Attachment attachment);

    /**
     * 设置消息延迟发送
     *
     * @param delayTimes
     * @param unit
     */
    void buildDelay(int delayTimes, TimeUnit unit);


    /**
     * 如果通知为延迟类型，设置通知可被取消
     */
    void buildCancelable();

    /**
     * 设置失败重试次数
     *
     * @param times 重试次数
     */
    void buildRetryTimes(int times);

    /**
     * 构建通知消息
     *
     * @return 通知
     */
    T build();

}
