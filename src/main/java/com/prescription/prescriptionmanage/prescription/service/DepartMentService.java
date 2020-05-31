package com.prescription.prescriptionmanage.prescription.service;

import com.prescription.prescriptionmanage.prescription.entity.Department;

public interface DepartMentService {

    public void insert(Department department);

    public Department getById(Integer id);

    public void update(Department department);

    public void deleteById(Integer id);

}
