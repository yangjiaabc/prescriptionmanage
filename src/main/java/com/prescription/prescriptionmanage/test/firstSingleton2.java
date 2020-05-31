package com.prescription.prescriptionmanage.test;

public class firstSingleton2 {

    //懒汉模式
    private static firstSingleton2 firstsingleton=null;

    private firstSingleton2(){};

    public static firstSingleton2 getFirstsingleton(){
        if(firstsingleton == null){
            firstsingleton = new firstSingleton2();
        }
        return firstsingleton;
    }

}
