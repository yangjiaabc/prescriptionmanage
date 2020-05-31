package com.prescription.prescriptionmanage.thread;

import java.util.concurrent.Callable;

public class TestCallable implements Callable<String> {

    //String name;
    /*public TestCallable(String name){
        this.name = name;
    };*/

    private int ticket = 5;

    @Override
    public String call() throws Exception {
        for (int i = 0; i < 5; i++) {
            if(this.ticket>0)
                System.out.println("买票，ticket="+this.ticket--);
        }
        return "执行玩了";
    }
}
