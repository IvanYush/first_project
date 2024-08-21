package org.javaacademy.core.homework.homework4.ex1.vehicle;

/**
 * Родительский класс. Транспортное средство.
 */
public abstract class Vehicle {
    private boolean isClean;
    private double widthCar;
    private double heightCar;
    private double lengthCar;

    public Vehicle(boolean isClean, double lengthCar, double heightCar, double widthCar) {
        this.isClean = isClean;
        this.widthCar = widthCar;
        this.heightCar = heightCar;
        this.lengthCar = lengthCar;
    }

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public double getWidthCar() {
        return widthCar;
    }

    public void setWidthCar(double widthCar) {
        this.widthCar = widthCar;
    }

    public double getHeightCar() {
        return heightCar;
    }

    public void setHeightCar(double heightCar) {
        this.heightCar = heightCar;
    }

    public double getLengthCar() {
        return lengthCar;
    }

    public void setLengthCar(double lengthCar) {
        this.lengthCar = lengthCar;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "isClean=" + isClean +
                ", widthCar=" + widthCar +
                ", heightCar=" + heightCar +
                ", lengthCar=" + lengthCar +
                '}';
    }
}