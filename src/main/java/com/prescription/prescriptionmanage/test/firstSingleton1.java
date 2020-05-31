package com.prescription.prescriptionmanage.test;

public class firstSingleton1 {

    //饿汉模式
    private static firstSingleton1 firstsingleton = new firstSingleton1();

    private firstSingleton1(){};

    public static firstSingleton1 getFirstsingleton(){
        return firstsingleton;
    }
}
