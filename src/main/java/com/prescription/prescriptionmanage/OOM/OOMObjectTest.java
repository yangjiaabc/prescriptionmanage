package com.prescription.prescriptionmanage.OOM;

import java.util.ArrayList;
import java.util.List;

public class OOMObjectTest {

    public static class OOMObject{
        public byte[] placebolder = new byte[64 * 1024];
    }

    public static void main(String[] args) throws InterruptedException {
        fillHeap(10000);
    }

    private static void fillHeap(int num) throws InterruptedException {
        List<OOMObject> list = new ArrayList<>();
        for(int i=0;i<num;i++){
            //稍作延时，令监视曲线的变化更明显
            Thread.sleep(50);
            list.add(new OOMObject());
        }
        System.gc();
    }
}
