package com.prescription.prescriptionmanage.thread.searchTest;

import com.prescription.prescriptionmanage.thread.entity.PhoneBook;
import com.prescription.prescriptionmanage.thread.service.impl.PhoneBookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class PhoneBookSearch {

    @Autowired
    private PhoneBookServiceImpl phoneBookServiceImpl;

    private List<PhoneBook> phonebookList;

    /*@Scheduled(cron="0 0/1 * * * ? ")*/
    public void searchPhone() {
        //单线程搜索
        ArrayList<PhoneBook> bookList = InitPhoneBooks.Init();
        PhoneBookSearch phoneBookSearch = new PhoneBookSearch();
        Long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            phoneBookSearch.searchPhoneBookByName("同学" + String.valueOf(i), this.phoneBookServiceImpl);
        }
        Long end = System.currentTimeMillis();
        Long total = end - start;
        System.out.println("总共执行" + total + "ms");
    }


    public void searchPhoneBook(String inName, ArrayList<PhoneBook> bookList) {
        Iterator iterator = bookList.iterator();
        while (iterator.hasNext()) {
            PhoneBook phoneBook = (PhoneBook) iterator.next();
            if (phoneBook.getEname().equals(inName)) {
                System.out.println("========姓名：" + phoneBook.getEname() + "/电话：" + phoneBook.getPhone() + "/地址: " + phoneBook.getAddress());
                return;
            }
        }

    }


    /**
     * 从数据库查询
     */
    public void searchPhoneBookByName(String inName, PhoneBookServiceImpl phoneBookService) {
        PhoneBook phoneBook = phoneBookService.getByName(inName);
        if (phoneBook.getEname().equals(inName)) {
            System.out.println("========姓名：" + phoneBook.getEname() + "/电话：" + phoneBook.getPhone() + "/地址: " + phoneBook.getAddress());
        }
    }


   /* public void start() {
        for (int i = 0; i < 200; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {

                }
            }).start();
            System.out.println(">>>>>>>>>>>>>消费者启动" + i + ">>>>>>>>>>>");
        }

    }*/

}
