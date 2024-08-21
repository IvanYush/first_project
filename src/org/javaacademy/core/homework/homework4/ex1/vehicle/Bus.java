package org.javaacademy.core.homework.homework4.ex1.vehicle;

/**
 * Автобус
 */
public class Bus  extends Vehicle {
    private int numberOfPassengers;

    public Bus(boolean isClean, double lengthCar, double heightCar, double widthCar, int numberOfPassengers) {
        super(isClean, lengthCar, heightCar, widthCar);
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public String toString() {
        return "Bus{" +
                super.toString() +
                " numberOfPassengers=" + numberOfPassengers +
                '}';
    }
}