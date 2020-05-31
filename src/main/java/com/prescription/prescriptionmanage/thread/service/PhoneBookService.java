package com.prescription.prescriptionmanage.thread.service;

import com.prescription.prescriptionmanage.thread.entity.PhoneBook;

public interface PhoneBookService {

    public void insert(PhoneBook phoneBook);

    public PhoneBook getByName(String name);
}
