package com.prescription.prescriptionmanage.thread;

public class TestThread implements Runnable{

    String name;

    public TestThread(String name){
        this.name = name;
    };

    @Override
    public void run() {
       for(int i=0;i<6;i++){
           System.out.println("==========="+name+i);
       }

    }
}
