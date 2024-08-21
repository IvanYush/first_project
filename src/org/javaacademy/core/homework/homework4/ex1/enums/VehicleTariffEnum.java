package org.javaacademy.core.homework.homework4.ex1.enums;

/**
 * Enum с тарифами
 */
public enum VehicleTariffEnum {
    TARIFF_FOR_BIG_VEHICLE(4000),
    TARIFF_FOR_SMALL_VEHICLE(2000);

    private int price;

    VehicleTariffEnum(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}