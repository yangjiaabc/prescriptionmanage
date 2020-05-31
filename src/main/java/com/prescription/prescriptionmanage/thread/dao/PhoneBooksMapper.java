package com.prescription.prescriptionmanage.thread.dao;

import com.prescription.prescriptionmanage.prescription.entity.Medicine;
import com.prescription.prescriptionmanage.thread.entity.PhoneBook;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PhoneBooksMapper {

    public void insert(PhoneBook phoneBook);

    public PhoneBook getByName(String name);

}
