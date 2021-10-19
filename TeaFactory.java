package com.company;

public class TeaFactory implements AbstractFactory{
    @Override
    public Cake getCake() {
        return new HoneyCake();
    }
    @Override
    public Tea getTea() {
        return new GingerTea();

    }
}
