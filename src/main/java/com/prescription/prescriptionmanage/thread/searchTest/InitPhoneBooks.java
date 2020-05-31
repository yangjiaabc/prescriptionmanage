package com.prescription.prescriptionmanage.thread.searchTest;

import com.prescription.prescriptionmanage.thread.entity.PhoneBook;

import java.util.ArrayList;
import java.util.List;

public class InitPhoneBooks {

    public static ArrayList<PhoneBook> Init(){

        ArrayList<PhoneBook> inArray = new ArrayList(){};
        for(int i=0;i<1500;i++){
            PhoneBook book = new PhoneBook();
            book.setEname("同学"+String.valueOf(i));
            book.setPhone("电话"+String.valueOf(i));
            book.setAddress("地址"+String.valueOf(i));
            inArray.add(book);
        }
        return inArray;
    }
}
