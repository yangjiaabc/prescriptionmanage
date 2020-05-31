package com.prescription.prescriptionmanage.prescription.service.impl;

import com.prescription.prescriptionmanage.prescription.dao.DepartmentMapper;
import com.prescription.prescriptionmanage.prescription.entity.Department;
import com.prescription.prescriptionmanage.prescription.service.DepartMentService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartMentServiceImpl implements DepartMentService {


    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public void insert(Department department) {
        departmentMapper.insert(department);
    }

    @Override
    public Department getById(Integer id) {
        Department department = departmentMapper.getById(id);
        return department;
    }

    @Override
    public void update(Department department) {

    }

    @Override
    public void deleteById(Integer id) {

    }
}
