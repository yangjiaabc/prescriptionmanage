package com.prescription.prescriptionmanage.prescription.service.impl;

import com.prescription.prescriptionmanage.prescription.dao.RoleDao;
import com.prescription.prescriptionmanage.prescription.entity.Role;
import com.prescription.prescriptionmanage.prescription.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {


    @Autowired
    private RoleDao roledao;

    @Override
    public Role insert(Role role) {
        Role  ro = roledao.save(role);
        return ro;
    }

    @Override
    public Role findbyId(Integer id) {
        Role role = roledao.getOne(1);
        return role;
    }
}
