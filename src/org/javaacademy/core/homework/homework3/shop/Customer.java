package org.javaacademy.core.homework.homework3.shop;

public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void checkShop(Shop shop) {
        //ПОМЕНЯТЬ ЗДЕСЬ ВЫРАЖЕНИЕ
        if (shop.isWorkersHasBadge() && shop.isClearFloor()) {
            System.out.println(name + ": Магазин прошел проверку");
        } else if (shop.isWorkersHasBadge() && shop.getCountWorkers() > 2) {
            System.out.println(name + ": Магазин прошел проверку");
        } else if (shop.getCountWorkers() > 2 && shop.isClearFloor()) {
            System.out.println(name + ": Магазин прошел проверку");
        } else {
            System.out.println(name + ": Магазин не прошел проверку!");
        }
    }
}
