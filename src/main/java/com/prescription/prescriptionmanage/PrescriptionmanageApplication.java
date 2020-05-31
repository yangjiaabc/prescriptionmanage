package com.prescription.prescriptionmanage;

import com.prescription.prescriptionmanage.common.ApplicationStartup;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableCaching
@MapperScan("com.prescription.prescriptionmanage.prescription.*.dao")
@SpringBootApplication
@EnableScheduling
@EnableAsync
public class PrescriptionmanageApplication extends SpringBootServletInitializer {

    @Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	    return application.sources(PrescriptionmanageApplication.class);
   }

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(PrescriptionmanageApplication.class);
        springApplication.addListeners(new ApplicationStartup());
        springApplication.run(args);
    }

}
