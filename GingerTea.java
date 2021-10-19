package com.company;

public class GingerTea implements Tea{
    @Override
    public void printName() {
        System.out.println("Ginger Tea");
    }
    @Override
    public void printPrise() {
        System.out.println("700");
    }
}
