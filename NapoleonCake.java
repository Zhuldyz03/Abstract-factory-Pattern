package com.company;

public class NapoleonCake implements Cake {
    @Override
    public void printName() {
        System.out.println("Napoleon cake");
    }
    @Override
    public void printPrise() {
        System.out.println("1000");
    }
}
