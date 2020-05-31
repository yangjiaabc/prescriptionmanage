package com.prescription.prescriptionmanage.prescription.dao;

import com.prescription.prescriptionmanage.prescription.entity.Department;
import com.prescription.prescriptionmanage.prescription.entity.Medicine;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MedicineMapper {

    public void insert(Medicine medicine);

    public Medicine getById(Integer id);

    public void update(Medicine medicine);

    public List<Medicine> queryAllMedicine();
}
