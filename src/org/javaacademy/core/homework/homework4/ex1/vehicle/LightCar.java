package org.javaacademy.core.homework.homework4.ex1.vehicle;

/**
 * Легковой автомобиль
 */
public class LightCar extends Vehicle {
    private boolean isCruiseControl;

    public LightCar(boolean isClean, double lengthCar, double heightCar, double widthCar, boolean isCruiseControl) {
        super(isClean, lengthCar, heightCar, widthCar);
        this.isCruiseControl = isCruiseControl;
    }

    @Override
    public String toString() {
        return "LightCar{" +
                super.toString() +
                " isCruiseControl=" + isCruiseControl +
                '}';
    }
}