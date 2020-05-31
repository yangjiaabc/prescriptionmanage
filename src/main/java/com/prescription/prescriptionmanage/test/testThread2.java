package com.prescription.prescriptionmanage.test;

public class testThread2 implements Runnable{

    private demo de;
    public testThread2(demo de){
        this.de = de;
    }
    @Override
    public void run() {
        de.function2();
    }
}
