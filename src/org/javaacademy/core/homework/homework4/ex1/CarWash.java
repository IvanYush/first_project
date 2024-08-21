package org.javaacademy.core.homework.homework4.ex1;

import org.javaacademy.core.homework.homework4.ex1.vehicle.Vehicle;
import org.javaacademy.core.homework.homework4.ex1.enums.VehicleTariffEnum;

/**
 * Класс автомойки
 */
public class CarWash {

    private int tariff(Vehicle vehicle) {
        if (vehicle.isClean()) {
            return 0;
        } else if (vehicle.getLengthCar() > 6 || vehicle.getHeightCar() > 2.5 || vehicle.getWidthCar() > 2) {
            return VehicleTariffEnum.TARIFF_FOR_BIG_VEHICLE.getPrice();
        } else {
            return VehicleTariffEnum.TARIFF_FOR_SMALL_VEHICLE.getPrice();
        }
    }

    public int washCar(Vehicle vehicle) {
        int price = tariff(vehicle);
        if (price == 0) {
            System.out.println("Машина " + vehicle + " уже чистая");
        } else {
            vehicle.setClean(true);
            System.out.println("Машина " + vehicle + " вымыта");
        }
        return price;
    }

    public int washCars(Vehicle[] vehicles) {
        int totalPrice = 0;
        for (Vehicle vehicle : vehicles) {
            totalPrice += washCar(vehicle);
        }
        return totalPrice;
    }
}