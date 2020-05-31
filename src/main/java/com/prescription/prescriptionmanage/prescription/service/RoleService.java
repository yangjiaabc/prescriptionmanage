package com.prescription.prescriptionmanage.prescription.service;

import com.prescription.prescriptionmanage.prescription.entity.Role;

public interface RoleService {

    //添加数据到role
    public Role insert(Role role);

    //根据id查询
    public Role findbyId(Integer id);
}
