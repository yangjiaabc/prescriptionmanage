package com.prescription.prescriptionmanage.prescription.controller;

import com.prescription.prescriptionmanage.prescription.entity.Role;
import com.prescription.prescriptionmanage.prescription.service.impl.RoleServiceImpl;
import com.prescription.prescriptionmanage.prescription.utils.GsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@Controller
public class RoleController {

    @Autowired
    private RoleServiceImpl roleServiceImpl;


    @RequestMapping("insertToRole")
    public void insertToRole(HttpServletRequest request, HttpServletResponse response) {
        Map<String,String> map = new HashMap();
        Role role = new Role();
        role.setName("管理员2");
        role.setDescr("这是管理员2");
        role = roleServiceImpl.insert(role);
        System.out.println("=========role "+role);
        map.put("result", "success");
        String result = GsonUtil.GsonString(map);
        try {
            PrintWriter out = response.getWriter();
            out.write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("findRoleByid")
    public String findRoleByid(Map<String,Object> map) {
        Role role = roleServiceImpl.findbyId(1);
        System.out.println("=========role "+role.getName());
        map.put("role",role);
        return "role";
    }

}
