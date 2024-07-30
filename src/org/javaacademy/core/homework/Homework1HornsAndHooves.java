package org.javaacademy.core.homework;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Homework1HornsAndHooves {
    public static void main(String[] args) {

        // я из новичков, сам что-то поизучал, попробовал написать
        BigDecimal sausagePrice = new BigDecimal(800); //цена колбасы
        BigDecimal hamPrice = new BigDecimal(350); //цена ветчины
        BigDecimal neckPrice = new BigDecimal(500); //цена шейки

        BigDecimal sausageCost; //себестоимость колбасы
        BigDecimal hamCost = new BigDecimal(275); //себестоимость ветчины
        BigDecimal neckCost; //себестоимость шейки

        BigDecimal weightSausage = new BigDecimal(2000); //продано колбасы
        BigDecimal weightHam = new BigDecimal(8511); //проданы ветчины
        BigDecimal weightNeck = new BigDecimal(6988); //проданы шейки

        //считаем суммарный доход
        BigDecimal incomeAll = (sausagePrice.multiply(weightSausage)).add(hamPrice.multiply(weightHam))
                .add(neckPrice.multiply(weightNeck));
        incomeAll = incomeAll.setScale(2, RoundingMode.HALF_UP);
        System.out.println("Суммарный доход: " + incomeAll);

        //считаем расход с колбасы
        if (weightSausage.compareTo(BigDecimal.valueOf(1000)) < 0) {
            sausageCost = BigDecimal.valueOf(412); //себестоимость при производстве меньше 1000
        } else if (weightSausage.compareTo(BigDecimal.valueOf(1000)) >= 0
                && weightSausage.compareTo(BigDecimal.valueOf(2000)) < 0) {
            sausageCost = BigDecimal.valueOf(408); //себестоимость при производстве от 1000 до 2000 (не включ)
        } else {
            sausageCost = BigDecimal.valueOf(404); //себестоимость при производстве от 2000
        }
        BigDecimal expensesSausage = sausageCost.multiply(weightSausage);

        //считаем расход с ветчины
        BigDecimal expensesHam = hamCost.multiply(weightHam);

        //считаем расход с шейки
        if (weightNeck.compareTo (BigDecimal.valueOf(500)) < 0) {
            neckCost = BigDecimal.valueOf(311); //себестоимость при производстве меньше 500
        } else {
            neckCost = BigDecimal.valueOf(299); //себестоимость при производстве больше или равно 500
        }
        BigDecimal expensesNeck = neckCost.multiply(weightNeck);

        //суммарный расход
        BigDecimal expensesAll = expensesSausage.add(expensesHam).add(expensesNeck).add(BigDecimal.valueOf(1_000_000));
        expensesAll = expensesAll.setScale(2, RoundingMode.HALF_UP);
        System.out.println("Суммарный расход: " + expensesAll);

        //прибыль до налогов
        BigDecimal profitBeforeTaxes = incomeAll.subtract(expensesAll);
        if (profitBeforeTaxes.compareTo(BigDecimal.valueOf(0)) > 0) {
            System.out.println("Прибыль до налогов: " + profitBeforeTaxes);
        } else {
            System.out.println("Убыток: " + profitBeforeTaxes);
            System.out.println("Денег нет, налогов нет");
            System.exit(0);
        }

        //налоги
        BigDecimal taxes;
        if (profitBeforeTaxes.compareTo(BigDecimal.valueOf(1_000_000)) <= 0) {
            taxes = profitBeforeTaxes.multiply(BigDecimal.valueOf(0.08));
        } else if (profitBeforeTaxes.compareTo(BigDecimal.valueOf(1_000_000)) > 0
                && profitBeforeTaxes.compareTo(BigDecimal.valueOf(2_000_000)) <= 0) {
            taxes = ((profitBeforeTaxes.subtract(BigDecimal.valueOf(1_000_000))).multiply(BigDecimal.valueOf(0.1)))
                    .add(BigDecimal.valueOf(1_000_000).multiply(BigDecimal.valueOf(0.08)));
        } else {
            taxes = ((profitBeforeTaxes.subtract(BigDecimal.valueOf(2_000_000))).multiply(BigDecimal.valueOf(0.13)))
                    .add(BigDecimal.valueOf(1_000_000).multiply(BigDecimal.valueOf(0.1)))
                    .add(BigDecimal.valueOf(1_000_000).multiply(BigDecimal.valueOf(0.08)));
        }
        taxes = taxes.setScale(2, RoundingMode.HALF_UP);
        System.out.println("Налог: " + taxes);

        //прибыль после налогов
        BigDecimal profitAfterTaxes = profitBeforeTaxes.subtract(taxes);
        System.out.println("Прибыль после налогов: " + profitAfterTaxes);
    }
}