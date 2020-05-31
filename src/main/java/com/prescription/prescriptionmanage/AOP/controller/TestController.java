package com.prescription.prescriptionmanage.AOP.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/aop")
    public String test() {
        return "first Controller";
    }

    @RequestMapping("/doError")
    public Object error() {
        return 1 / 0;
    }

}
