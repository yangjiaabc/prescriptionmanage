package com.prescription.prescriptionmanage.prescription.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.InputStream;
import java.util.Map;

@Controller
public class ThymeleafController {


    @RequestMapping("hello")
    public String hello(Map<String,Object> map){
        map.put("msg", "hello thymeleaf");

        return "thymeleaf";
    }


}
