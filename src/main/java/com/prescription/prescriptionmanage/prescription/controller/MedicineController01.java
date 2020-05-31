package com.prescription.prescriptionmanage.prescription.controller;

import com.prescription.prescriptionmanage.prescription.entity.Medicine;
import com.prescription.prescriptionmanage.prescription.service.impl.MedicineServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class MedicineController01 {

    @Autowired
    private MedicineServiceImpl medicineServiceImpl;

    /**
     * 查询药品列表数据
     * @return
     */
    @RequestMapping("queryAllMedicine02")
    public List queryAllMedicine02(Map<String,Object> map) {
        System.out.println("开始查询数据1");
        List<Medicine> medicineList = medicineServiceImpl.queryAllMedicine();
        System.out.println("查询数据结束2");
        map.put("medicineList",medicineList);
        return medicineList;
    }
}
