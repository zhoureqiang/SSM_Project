package com.zhourq.service.mq;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

/**
 * Copyright (C) 2018 思创数码科技股份有限公司
 * <p>
 * 版权所有。
 * <p>
 *
 * @ClassName ProducerService
 * @Description 队列消息生产者
 * @Author zhourq
 * @Date 2019/3/12 16:29
 * @Version 1.0
 **/
@Service
public class ProducerService {
    @Resource(name="jmsTemplate")
    private JmsTemplate jmsTemplate;

    public void sendMessage(Destination destination, final String msg){
        System.out.println(Thread.currentThread().getName()+" 向队列"+destination.toString()+"发送消息---------------------->"+msg);
        jmsTemplate.send(destination, new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(msg);
            }
        });
    }

    public void sendMessage(final String msg){
        String destination = jmsTemplate.getDefaultDestinationName();
        System.out.println(Thread.currentThread().getName()+" 向队列"+destination+"发送消息---------------------->"+msg);
        jmsTemplate.send(new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(msg);
            }
        });
    }

}
