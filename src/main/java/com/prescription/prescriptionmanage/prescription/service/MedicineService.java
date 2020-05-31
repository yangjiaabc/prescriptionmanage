package com.prescription.prescriptionmanage.prescription.service;

import com.prescription.prescriptionmanage.prescription.entity.Department;
import com.prescription.prescriptionmanage.prescription.entity.Medicine;

import java.util.List;

public interface MedicineService {

    public Medicine getById(Integer id);

    public void update(Medicine medicine);

    public List<Medicine> queryAllMedicine();
}
