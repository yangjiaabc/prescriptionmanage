package com.prescription.prescriptionmanage.Webconfig.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

//统计在线人数
public class peopleonline implements HttpSessionListener {

    public int count=0;//记录session的数量
    public void sessionCreated(HttpSessionEvent arg0) {//监听session的创建
        count++;
        arg0.getSession().getServletContext().setAttribute("Count", count);

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent arg0) {//监听session的撤销
        count--;
        arg0.getSession().getServletContext().setAttribute("Count", count);
    }

}
