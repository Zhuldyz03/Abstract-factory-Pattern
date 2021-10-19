package com.company;

public class Main {

    public static void main(String[] args) {
	AbstractFactory factoryCake = new CakeFactory();
	AbstractFactory factoryTea = new TeaFactory();

	Cake cake =factoryCake.getCake();
	Tea tea = factoryTea.getTea();

	System.out.println("First dessert option:");

	factoryCake.getCake().printName();
	factoryTea.getTea().printName();

	System.out.println("Prise:");

	factoryCake.getCake().printPrise();
	factoryTea.getTea().printPrise();

	System.out.println("Second dessert option:");

	factoryTea.getCake().printName();
	factoryCake.getTea().printName();

	System.out.println("Prise:");

	factoryTea.getCake().printPrise();
	factoryCake.getTea().printPrise();

    }
}

