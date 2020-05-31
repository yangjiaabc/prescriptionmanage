package com.prescription.prescriptionmanage.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@EnableDefineService
@SpringBootApplication
public class BootStrap {

    public static void main(String[] args) {

        ConfigurableApplicationContext  Context = SpringApplication.run(BootStrap.class);
        TestService testService =  Context.getBean(TestService.class);
        System.out.println("=========="+testService);
    }
}
