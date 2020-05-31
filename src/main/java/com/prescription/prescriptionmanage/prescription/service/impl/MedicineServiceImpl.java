package com.prescription.prescriptionmanage.prescription.service.impl;

import com.prescription.prescriptionmanage.prescription.dao.MedicineMapper;
import com.prescription.prescriptionmanage.prescription.entity.Medicine;
import com.prescription.prescriptionmanage.prescription.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineServiceImpl implements MedicineService {

    @Autowired
    private MedicineMapper medicineMapper;

    @Override
    public Medicine getById(Integer id) {
        return null;
    }

    @Override
    public void update(Medicine medicine) {

    }

    /**
     * 查询药品列表
     * @return
     */
    @Override
    public List<Medicine> queryAllMedicine() {
        List<Medicine> medicineList = medicineMapper.queryAllMedicine();
        return medicineList;
    }
}
