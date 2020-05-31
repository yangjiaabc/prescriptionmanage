package com.prescription.prescriptionmanage.test;

public class secondSingleton {

    //懒汉式
    private static secondSingleton singleton =null;

    private secondSingleton(){};

    public static secondSingleton getSingleton(){
        if(singleton == null){
            singleton = new secondSingleton();
        }
        return singleton;
    }
}
