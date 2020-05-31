package com.prescription.prescriptionmanage.Webconfig.listener;


import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *
 */
public class ListenerTest implements ServletContextListener {

    @Override
	public void contextInitialized(ServletContextEvent sce) {
        System.out.println("监听器初始化...");
        System.out.println("================yangjia===============");
        System.out.println("================>>>>>>>>==============");
        System.out.println("================********==============");
        System.out.println("================yangjia===============");
    }

    @Override
	public void contextDestroyed(ServletContextEvent sce) {

    }

}
