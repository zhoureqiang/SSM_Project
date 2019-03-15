package com.zhourq.controller.mq;

import com.zhourq.service.mq.ConsumerService;
import com.zhourq.service.mq.ProducerService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.TextMessage;

/**
 * Copyright (C) 2018 思创数码科技股份有限公司
 * <p>
 * 版权所有。
 * <p>
 *
 * @ClassName MessageController
 * @Description TODO
 * @Author zhourq
 * @Date 2019/3/12 17:10
 * @Version 1.0
 **/
@Controller
@RequestMapping("activeMQ")
public class MessageController {
    private Logger logger = Logger.getLogger(MessageController.class);
    @Resource(name = "demoQueueDestination")
    private Destination destination;

    //队列消息生产者
    @Resource(name = "producerService")
    private ProducerService producer;

    //队列消息消费者
    @Resource(name = "consumerService")
    private ConsumerService consumer;

    @RequestMapping(value = "/SendMessage", method = RequestMethod.POST)
    @ResponseBody
    public String send(String msg) {
        logger.info(Thread.currentThread().getName()+"------------send to jms Start");
        producer.sendMessage(msg);
        logger.info(Thread.currentThread().getName()+"------------send to jms End");
        return msg;
    }

    @RequestMapping(value= "/ReceiveMessage",method = RequestMethod.GET)
    @ResponseBody
    public String  receive(){
        logger.info(Thread.currentThread().getName()+"------------receive from jms Start");
        TextMessage tm = consumer.receive(destination);
        logger.info(Thread.currentThread().getName()+"------------receive from jms End");
        try {
            return tm.getText();
        } catch (JMSException e) {
            e.printStackTrace();
        }
        return "error";
    }

}
