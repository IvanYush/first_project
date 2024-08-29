package org.javaacademy.core.homework.homework5;

import org.javaacademy.core.homework.homework5.ex2.Computer;
import org.javaacademy.core.homework.homework5.ex2.ComputerFake;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws IOException {

        ex1();
        ex2();
    }

    private static void ex1() {

        String[] countries = {"Россия", "Франция", "Китай", "Япония", "Турция"};
        String filename = "donation.csv";

        // итоговый массив
        String[] countriesWithDonates = new String[countries.length];
        //в эту переменную будем построчно писать файл
        String str = "";
        //массив для выгрузки сумм донатов по странам.
        BigDecimal[] sum = new BigDecimal[countries.length];
        Arrays.fill(sum, BigDecimal.ZERO);

        try (Scanner scanner = new Scanner(Runner.class.getClassLoader().getResourceAsStream(filename));) {
            while (scanner.hasNext()) {
                str = scanner.nextLine(); //пишем файл построчно
                str = str.replaceFirst(",", "."); //меняем запятую на точку
                String[] str1 = str.split(";"); //разбиваем строку на массив {страна, сумма}
                for (int i = 0; i < countries.length; i++) {
                    if (str1[0].equals(countries[i])) {
                        try {
                            Double number = Double.valueOf(str1[1]);
                            sum[i] = sum[i].add(BigDecimal.valueOf(number));
                            countriesWithDonates[i] = countries[i] + " - " + sum[i];
                            break;
                        } catch (RuntimeException e) {
                        }
                    }
                }
            }
        }
        for (String country : countriesWithDonates) {
            System.out.println(country);
        }
    }

    private static void ex2() throws IOException {
        Computer computer = new Computer();
        ComputerFake computerFake = new ComputerFake(computer);

        computerFake.login();
        computerFake.printMessage();
        computerFake.logout();
    }
}