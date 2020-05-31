package com.prescription.prescriptionmanage.test;

public class ThreadTest {
    private static demo sychronizedTest = new demo();

   /* public static class thred1 implements Runnable{
        @Override
        public void run() {
            sychronizedTest.function1();
        }
    }
    public static class thred2 implements Runnable{
        @Override
        public void run() {
            sychronizedTest.function2();
        }
    }*/

    public static void main(String[] args) {
        Thread t1 =new Thread(new testThread(sychronizedTest));
        Thread t2 =new Thread(new testThread2(sychronizedTest));
        t1.start();
        t2.start();
    }
}
