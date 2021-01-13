package com.codegym;

public class TestStaticProperty {
    public static void main(String[] args) {

        Car car1 = new Car("Mazda 3", "Skyactiv 3");
        System.out.println("Car " + Car.numberOfCars + ": " + car1.getName() + ", " + car1.getEngine());

        Car car2 = new Car("Mazda 6", "Skyactiv 6");
        System.out.println("Car " + Car.numberOfCars + ": " + car2.getName() + ", " + car2.getEngine());
        Car car3 = new Car("Mazda 9", "Skyactiv 9");
        System.out.println("Car " + Car.numberOfCars + ": " + car3.getName() + ", " + car3.getEngine());


    }
}
