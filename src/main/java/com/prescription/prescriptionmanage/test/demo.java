package com.prescription.prescriptionmanage.test;

public class demo {

    public static synchronized void function2(){
        long start = System.currentTimeMillis();
        System.out.println("非静态方法2开始执行");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("非静态方法2执行结束花费时间："+(System.currentTimeMillis()-start));
    }

    public static synchronized void function1(){
        long start = System.currentTimeMillis();
        System.out.println("静态方法1开始执行");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("静态方法1执行结束花费时间："+(System.currentTimeMillis()-start));
    }
}
