package com.prescription.prescriptionmanage.common;

import com.prescription.prescriptionmanage.thread.searchTest.PhoneBookSearch;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class ApplicationStartup  implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
            System.out.println("===================start==================");
            PhoneBookSearch bean = event.getApplicationContext().getBean(PhoneBookSearch.class);
            //bean.start();
            System.out.println("====================end===================");
        }
}
