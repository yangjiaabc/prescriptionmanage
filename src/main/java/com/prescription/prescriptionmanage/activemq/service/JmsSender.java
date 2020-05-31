package com.prescription.prescriptionmanage.activemq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Queue;
import javax.jms.Topic;

@Component
public class JmsSender {

    @Autowired
	private Queue queue1;

	@Autowired
	private Topic topic;

	@Autowired
	private JmsMessagingTemplate jmsTemplate;

	public void sendByQueue(String message) {

		this.jmsTemplate.convertAndSend(queue1, message);
    }

	public void sendByTopic(String message) {
	  this.jmsTemplate.convertAndSend(topic, message);
    }
}

