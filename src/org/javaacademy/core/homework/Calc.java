package org.javaacademy.core.homework;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число");
        double firstNumber = scanner.nextDouble();

        scanner.nextLine(); // иначе 15 строка не работает. Причину загуглил.
        // нашёл 3 способа реализации ковычек в тексте. Выбрал этот, так как он менее трудозатратен и компактен.
        System.out.println("Введите знак операции - " + "\"+\", " + "\"-\", " + "\"*\", " + "\"/\"");
        String sign = scanner.nextLine();

        System.out.println("Введите второе число");
        double secondNumber = scanner.nextDouble();

        // условие
        if (sign.equals("+")) {
            System.out.println("Ответ: " + (firstNumber + secondNumber));
        } else if (sign.equals("-")) {
            System.out.println("Ответ: " + (firstNumber - secondNumber));
        } else if (sign.equals("*")) {
            System.out.println("Ответ: " + (firstNumber * secondNumber));
        } else if (sign.equals("/") && secondNumber == 0) {
            System.out.println("Ошибка: деление на ноль"); // без этого условия он пишет "Ответ: Infinity"
        } else if (sign.equals("/")) {
            System.out.println("Ответ: " + (firstNumber / secondNumber));
        } else {
            System.out.println("Ошибка: неверный знак операции");
        }
        scanner.close();
    }
}
