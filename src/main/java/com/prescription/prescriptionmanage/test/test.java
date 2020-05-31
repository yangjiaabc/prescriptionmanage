package com.prescription.prescriptionmanage.test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.*;

public class test {
    private static ExecutorService exc= null;
    {
    }

    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        String str = new String();
        StringBuffer sbf = new StringBuffer();
        sbf.append("aa");
        sbf.append("bb");

        StringBuilder sbd = new StringBuilder();
        sbd.append("aa");

        Map map = new HashMap();
        map.put("aa","小明");
        map.put("bb","lala");

        ConcurrentHashMap map01 = new ConcurrentHashMap();
        map01.put("aa","bb");
        map.get("aa");
        map.get("bb");


        Hashtable h1 = new Hashtable();
        h1.put("aa","bb");
        h1.get("aa");

    }
}
