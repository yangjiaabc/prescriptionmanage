package com.prescription.prescriptionmanage.activemq.service;

import com.prescription.prescriptionmanage.activemq.config.JmsConfirguration;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JmsReceiver {

    /**
     * 点对点 (P2P)
     * @param message
     */
    @JmsListener(destination = JmsConfirguration.QUEUE_NAME)
	public void receiveByQueue(String message) {
            System.out.println("接收队列消息01:" + message);
    }

    @JmsListener(destination = JmsConfirguration.QUEUE_NAME)
    public void receiveByQueue02(String message) {
        System.out.println("接收队列消息02:" + message);
    }

    /**
     * 发布/订阅模式  消费者
     * @param message
     */
    @JmsListener(destination = JmsConfirguration.TOPIC_NAME)
	public void receiveByTopic(String message) {
        System.out.println("接收主题消息01:" + message);
    }

    @JmsListener(destination = JmsConfirguration.TOPIC_NAME)
    public void receiveByTopic02(String message) {
        System.out.println("接收主题消息02:" + message);
    }

    @JmsListener(destination = JmsConfirguration.TOPIC_NAME)
    public void receiveByTopic03(String message) {
        System.out.println("接收主题消息03:" + message);
    }


}

