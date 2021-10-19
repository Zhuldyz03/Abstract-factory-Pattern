package com.company;

public class BerryTea implements Tea {
    @Override
    public void printName() {
        System.out.println("Berry Tea");
    }
    @Override
    public void printPrise() {
        System.out.println("600");
    }
}
