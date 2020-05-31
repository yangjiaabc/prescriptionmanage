package com.prescription.prescriptionmanage.test;

public class firstSingleton {

    //饿汉式
    private static firstSingleton singleton = new firstSingleton();

    private firstSingleton(){};

    public static firstSingleton getSingleton(){
        return singleton;
    }
}
