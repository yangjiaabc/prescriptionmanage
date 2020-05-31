package com.prescription.prescriptionmanage.thread.searchTest;

import com.prescription.prescriptionmanage.thread.entity.PhoneBook;
import com.prescription.prescriptionmanage.thread.service.impl.PhoneBookServiceImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
public class SearchThread implements Callable {

    ArrayList<PhoneBook> bookList;

    String name;

    PhoneBookServiceImpl phoneBookService;

    public SearchThread(ArrayList<PhoneBook> inbookList, String inname, PhoneBookServiceImpl phoneBookServiceImpl){
           this.bookList = inbookList;
           this.name = inname;
           this.phoneBookService = phoneBookServiceImpl;
    };

    @Override
    public Object call() throws Exception {
           //操作一下数据库
            //List<Medicine> medicineList = medicine.queryAllMedicine();
            Iterator iterator =bookList.iterator();
            while (iterator.hasNext()){
                PhoneBook phoneBook = (PhoneBook)iterator.next();
                if(phoneBook.getEname().equals(name)){
                    System.out.println("========姓名："+phoneBook.getEname() +"/电话："+phoneBook.getPhone()+"/地址: "+phoneBook.getAddress());
                }
            }
        //从数据库进行查询
        /*PhoneBook  phoneBook = phoneBookService.getByName(name);
        if(phoneBook.getEname().equals(name)){
            System.out.println("========姓名："+phoneBook.getEname() +"/电话："+phoneBook.getPhone()+"/地址: "+phoneBook.getAddress());

        }*/
        return null;
    }
}
