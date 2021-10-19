package com.company;

public class CakeFactory implements AbstractFactory{
    @Override
    public Cake getCake() {
        return new NapoleonCake();
    }
    @Override
    public Tea getTea() {
        return new BerryTea();

        }
    }

