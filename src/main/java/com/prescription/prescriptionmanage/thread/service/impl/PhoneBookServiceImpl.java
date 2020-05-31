package com.prescription.prescriptionmanage.thread.service.impl;

import com.prescription.prescriptionmanage.thread.dao.PhoneBooksMapper;
import com.prescription.prescriptionmanage.thread.entity.PhoneBook;
import com.prescription.prescriptionmanage.thread.service.PhoneBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhoneBookServiceImpl implements PhoneBookService {

    @Autowired
    private PhoneBooksMapper phoneBooksMapper;

    @Override
    public void insert(PhoneBook phoneBook) {
        phoneBooksMapper.insert(phoneBook);
    }

    @Override
    public PhoneBook getByName(String name) {
        PhoneBook phonebook = phoneBooksMapper.getByName(name);
        return phonebook;
    }
}
