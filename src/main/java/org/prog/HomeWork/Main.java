package org.prog.HomeWork;

public class Main {

    public static void main(String[] args) {

        CarService carService = new CarService();

        Car leo = new Car();

        int amountToPay = 10;


        leo.goTo("Ughorod", 150);

        System.out.println("After payment: " + amountToPay);
    }
}