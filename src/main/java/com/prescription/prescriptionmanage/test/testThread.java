package com.prescription.prescriptionmanage.test;

public class testThread implements Runnable {
    private demo de;
    public testThread(demo de){
        this.de = de;
    }
    @Override
    public void run() {
        de.function1();
    }
}
