package com.prescription.prescriptionmanage.activemq.test;

import com.prescription.prescriptionmanage.activemq.service.JmsSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class JmsTest {

	@Autowired
	private JmsSender sender;

	@Test
	public void testSendByQueue() {
	for (int i = 1; i <6; i++) {
	    this.sender.sendByQueue("你好 activemq queue " + i);
    }
  }

    @Test
	public void testSendByTopic() {
    for (int i = 1; i <6; i++) {
	    this.sender.sendByTopic("杨佳 activemq 发布、订阅 " + i);
    }
  }
}
