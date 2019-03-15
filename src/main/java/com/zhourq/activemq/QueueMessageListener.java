package com.zhourq.activemq;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Copyright (C) 2018 思创数码科技股份有限公司
 * <p>
 * 版权所有。
 * <p>
 *
 * @ClassName QueueMessageListener
 * @Description 队列消息队列监听
 * @Author zhourq
 * @Date 2019/3/12 16:24
 * @Version 1.0
 **/
public class QueueMessageListener implements MessageListener {
    @Override
    public void onMessage(Message message) {
        TextMessage tm = (TextMessage) message;
        try {
            System.out.println("QueueMessageListener监听到了文本消息：\t"
                    + tm.getText());
            //do something ...
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }

}
