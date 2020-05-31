package com.prescription.prescriptionmanage.thread.controller;

import com.prescription.prescriptionmanage.thread.entity.PhoneBook;
import com.prescription.prescriptionmanage.thread.service.impl.PhoneBookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PhoneBookController {

    @Autowired
    private PhoneBookServiceImpl phoneBookServiceImpl;


    /**
     * 通讯录插入数据
     * @return
     */
    @RequestMapping("InsertPhoneBook")
    public void InsertPhoneBook() {
        System.out.println("开始插入数据1");
        for(int i=0;i<1000;i++){
            PhoneBook book = new PhoneBook();
            book.setEname("同学"+String.valueOf(i));
            book.setPhone("电话"+String.valueOf(i));
            book.setAddress("地址"+String.valueOf(i));
            phoneBookServiceImpl.insert(book);
            System.out.println("第"+i+"条插入结束");
        }
        System.out.println("查询插入结束");

    }

    /**
     * 查询入数据
     * @return
     */
    @RequestMapping("SelectByName")
    public void SelectByName() {
        System.out.println("开始查询数据1");
        PhoneBook phoneBook = phoneBookServiceImpl.getByName("同学1");
        System.out.println("电话："+phoneBook.getPhone());
        System.out.println("查询查询结束");

    }

}
