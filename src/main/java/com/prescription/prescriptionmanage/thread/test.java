package com.prescription.prescriptionmanage.thread;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class test {

    public static void main(String[] args) {
       /* TestThread thread1 = new TestThread("A");
        TestThread thread2 = new TestThread("B");
        new Thread(thread1).start();
        new Thread(thread2).start();*/
       /* TestCallable call1 = new TestCallable("A");
        TestCallable call2 = new TestCallable("B");
        FutureTask<String> task1 = new FutureTask<String>(call1);
        FutureTask<String> task2 = new FutureTask<String>(call2);
        new Thread(task1).start();
        new Thread(task2).start();*/
       /* Callable<String> tc = new TestCallable();
        FutureTask<String> task = new FutureTask<String>(tc);
        new Thread(task).start();
        try {
            System.out.println(task.get());//获取返回值
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }*/
        List list = new LinkedList(){};
    }
}
