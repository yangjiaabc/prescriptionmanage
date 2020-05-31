package com.prescription.prescriptionmanage.prescription.dao;

import com.prescription.prescriptionmanage.prescription.entity.Department;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DepartmentMapper {

   	public void insert(Department department);

   	public Department getById(Integer id);

	public void update(Department department);

	public void deleteById(Integer id);

}
