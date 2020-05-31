package com.prescription.prescriptionmanage.thread.searchTest;

import com.prescription.prescriptionmanage.thread.entity.PhoneBook;
import com.prescription.prescriptionmanage.thread.service.impl.PhoneBookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.concurrent.*;

@Service
public class SearchPhoneBook {

    @Autowired
    private PhoneBookServiceImpl phoneBookServiceImpl;

    private  static ExecutorService exec = null;
    {
        exec = new ThreadPoolExecutor(50,Integer.MAX_VALUE,360l, TimeUnit.SECONDS,new SynchronousQueue<Runnable>());
    }

    //@Scheduled(cron="0 0/1 * * * ? ")
    public void searchPhone() {
        ArrayList<PhoneBook> bookList = InitPhoneBooks.Init();
        PhoneBookSearch phoneBookSearch = new PhoneBookSearch();
        Long start = System.currentTimeMillis();
        for (int i =0;i<1000;i++){
            SearchThread searchThread = new SearchThread(bookList,"同学"+String.valueOf(i),this.phoneBookServiceImpl);
            FutureTask futureTask = new FutureTask <>(searchThread);
            new Thread(futureTask).start();
            exec.submit(searchThread);
        }
        Long end = System.currentTimeMillis();
        Long total = end-start;
        System.out.println("总共执行"+total+"ms");
    }
}
