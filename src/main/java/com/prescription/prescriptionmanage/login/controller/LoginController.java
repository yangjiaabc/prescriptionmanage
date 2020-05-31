package com.prescription.prescriptionmanage.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {


    @RequestMapping("/login")
    @ResponseBody
    public String login(HttpServletRequest request){
        String name = request.getParameter("name");
        String password = request.getParameter("passsword");
        System.out.println("======"+name);
        System.out.println("======"+password);
        return "SUCCESS";
    }

    @RequestMapping("/login2")
    public String login(String name,String password){
        System.out.println("======"+name);
        System.out.println("======"+password);
        return "SUCCESS";
    }
}
