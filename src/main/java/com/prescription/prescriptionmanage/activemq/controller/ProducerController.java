package com.prescription.prescriptionmanage.activemq.controller;

import com.prescription.prescriptionmanage.activemq.service.JmsSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class ProducerController {

    @Autowired
    private JmsSender jmsSender;

    /**
     * 消息生产者 Queue
     */
    @RequestMapping("sendMsgByQueue")
    public void sendMsg(HttpServletRequest request, HttpServletResponse response){
        for(int i=0;i<=5;i++){
            jmsSender.sendByQueue("杨佳发送消息"+i);
        }
    }

    /**
     * 消息生产者 Queue
     */
    @RequestMapping("sendMsgByTopic")
    public void sendMsgByTopic(){
        for(int i=0;i<=10;i++){
            jmsSender.sendByTopic("杨佳发送TOP消息"+i);
        }

    }


}
