package com.prescription.prescriptionmanage.prescription.controller;




import com.prescription.prescriptionmanage.prescription.entity.Medicine;
import com.prescription.prescriptionmanage.prescription.service.impl.MedicineServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MedicineController {

    @Autowired
    private MedicineServiceImpl medicineServiceImpl;

    /**
     * 查询药品列表数据
     * @return
     */
    @RequestMapping("queryAllMedicine")
    public String queryAllMedicine(Map<String,Object> map) {
        System.out.println("开始查询数据1");
        List<Medicine> medicineList = medicineServiceImpl.queryAllMedicine();
        System.out.println("查询数据结束2");
        map.put("medicineList",medicineList);
        return "medicine";
    }


    /**
     * 查询药品列表数据
     * @return
     */
    @RequestMapping("queryAllMedicine01")
    @ResponseBody
    public List queryAllMedicine01(Map<String,Object> map) {
        System.out.println("开始查询数据1");
        List<Medicine> medicineList = medicineServiceImpl.queryAllMedicine();
        System.out.println("查询数据结束2");
        map.put("medicineList",medicineList);
        return medicineList;
    }
}
