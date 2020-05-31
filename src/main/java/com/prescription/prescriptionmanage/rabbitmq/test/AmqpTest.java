package com.prescription.prescriptionmanage.rabbitmq.test;

import com.prescription.prescriptionmanage.rabbitmq.service.AmqpSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AmqpTest {

	@Autowired
	private AmqpSender sender;

	/**
	 * 简单模式
	 */
	@Test
	public void testSimpleSend() {
        for (int i = 1; i <=10; i++) {
            this.sender.simpleSend("简单模式发送 " + i);
        }
  }


	/**
	 * 发布/订阅模式
	 */
	@Test
	public void testPsSend() {
        for (int i = 1; i <=10; i++) {
            this.sender.psSend("test 发布订阅模式发送 " + i);
        }
  }


	 /**
	 * 路由模式
	 */
	@Test
	public void testRoutingSend() {
        for (int i = 1; i <6; i++) {
            this.sender.routingSend("search", "test routingSend " + i);
        }
	}


	/**
	 *主题模式（通配符模式）
	 */
	@Test
	public void testTopicSend() {
	    for (int i = 1; i <6; i++) {
	        this.sender.topicSend("user.add", "test topicSend " + i);
        }
	}
}
