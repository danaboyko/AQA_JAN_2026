package org.prog.HomeWork;

public class Car {

    public String color;
    public int mileage;
    public String plateNumber;
    public String owner;

    public void goTo(String destination, int speed) {
 //       System.out.println("before trip miles: " + mileage);
 //       if ("black".equals(color)) {
 //           System.out.println("Black cars are cool");

 //       mileage += speed * 10;

        System.out.println(owner + " car owner by is going to " + destination +
                " at " + speed + " km/h");
        System.out.println("After trip miles: " + mileage);
    }
}

