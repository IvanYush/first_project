package org.javaacademy.core.homework;

import java.util.Scanner;
import java.math.BigDecimal;

public class Homework1HornsAndHooves {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //я из новичков, но попытался решить с самостоятельным изучением
        //переменные в double т.к. там могут быть копейки или граммы
        double sausagePrice = 800; //цена колбасы
        double hamPrice = 350; //цена ветчины
        double neckPrice = 500; //цена шейки

        double sausageCost; //себестоимость колбасы
        double hamCost = 275; //себестоимость ветчины
        double neckCost; //себестоимость шейки

        System.out.println("Введите количество проданной колбасы в кг.");
        double weightSausage = scanner.nextDouble();

        System.out.println("Введите количество проданной ветчины в кг.");
        double weightHam = scanner.nextDouble();

        System.out.println("Введите количество проданной шейки в кг.");
        double weightNeck = scanner.nextDouble();

        /*
        double weightSausage = 2000; //продано колбасы
        double weightHam = 8511; //проданы ветчины
        double weightNeck = 6988; //проданы шейки
        */

        //считаем суммарный доход
        double incomeAll = (sausagePrice * weightSausage) + (hamPrice * weightHam) + (neckPrice * weightNeck);
        System.out.println("Суммарный доход: " + incomeAll);

        //считаем расход с колбасы
        if (weightSausage < 1000) {
            sausageCost = 412; //себестоимость при производстве меньше 1000
        } else if (weightSausage >= 1000 && weightSausage < 2000) {
            sausageCost = 408; //себестоимость при производстве от 1000 до 2000 (не включ)
        } else {
            sausageCost = 404; //себестоимость при производстве от 2000
        }
        double expensesSausage = sausageCost * weightSausage;

        //считаем расход с ветчины
        double expensesHam = hamCost * weightHam;

        //считаем расход с шейки
        if (weightNeck < 500) {
            neckCost = 311; //себестоимость при производстве меньше 500
        } else {
            neckCost = 299; //себестоимость при производстве больше или равно 500
        }
        double expensesNeck = neckCost * weightNeck;

        //суммарный расход
        double expensesAll = expensesSausage + expensesHam + expensesNeck + 1_000_000;
        System.out.println("Суммарный расход: " + expensesAll);

        //прибыль до налогов
        BigDecimal profitBeforeTaxes = BigDecimal.valueOf(incomeAll).subtract(BigDecimal.valueOf(expensesAll));
        System.out.println("Прибыль до налогов: " + profitBeforeTaxes);

        //налоги
        BigDecimal taxes;
        if (profitBeforeTaxes.compareTo(BigDecimal.valueOf(1_000_000)) <= 0) {
            taxes = profitBeforeTaxes.multiply(BigDecimal.valueOf(0.08));
        } else if (profitBeforeTaxes.compareTo(BigDecimal.valueOf(1_000_000)) > 0 && profitBeforeTaxes.compareTo(BigDecimal.valueOf(2_000_000)) <= 0) {
            taxes = ((profitBeforeTaxes.subtract(BigDecimal.valueOf(1_000_000))).multiply(BigDecimal.valueOf(0.1))).add(BigDecimal.valueOf(80_000));
        } else {
            taxes = ((profitBeforeTaxes.subtract(BigDecimal.valueOf(2_000_000))).multiply(BigDecimal.valueOf(0.13))).add(BigDecimal.valueOf(180_000));
        }
        System.out.println("Налог: " + taxes);

        //прибыль после налогов
        BigDecimal profitAfterTaxes = profitBeforeTaxes.subtract(taxes);
        System.out.println("Прибыль после налогов: " + profitAfterTaxes);
    }

}


