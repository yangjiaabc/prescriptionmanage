package com.prescription.prescriptionmanage.prescription.controller;

import com.prescription.prescriptionmanage.prescription.entity.Department;
import com.prescription.prescriptionmanage.prescription.service.impl.DepartMentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class DepartMentController {

    @Autowired
    private DepartMentServiceImpl departMentServiceImpl;

   /* @Autowired
    private DepartMentServiceImpltwo departmentServiceImpltwo;

        @RequestMapping("save")
    	public Map<String,Object>save(Department department) {
        	this.departmentServiceImpltwo.save(department);
  	        Map<String,Object> map = new HashMap<String,Object>();
  	        map.put("code", "200");
  	        map.put("msg", "保存成功");
        	return map;
    	}

    	@RequestMapping("get/{id}")
        public Map<String,Object>get(@PathVariable("id") Integer id) {
             Department department = this.departmentServiceImpltwo.getDepartmentById(id);
             Map<String,Object> map = new HashMap<String,Object>();
             map.put("code", "200");
             map.put("msg", "获取成功");
             map.put("data", department);
             return map;
        }*/



    /**
     * 插入数据
     * @return
     */
    @RequestMapping("departmentInsert")
    public void departmentInsert() {
        System.out.println("开始插入数据");
        Department department =new Department();
        department.setName("小里");
        department.setDescr("打开的看看============");
        departMentServiceImpl.insert(department);
        System.out.println("插入数据成功");
    }


    /**
     * 根据id查询数据
     * @return
     */
    @RequestMapping("departmentSelect")
    public String departmentSelect(Map<String,Object> map) {
        System.out.println("开始查询数据");
        Department department = departMentServiceImpl.getById(1);
        map.put("department", department);
        System.out.println("=========department");
        return "list";
    }

}
