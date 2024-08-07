package org.javaacademy.core.homework.homework2;

import java.util.Random;

public class Homework2 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
    }

    public static void ex1() {
        System.out.println("Задание №1");
        //Дан массив со словами
        String[] words = {"Это", "шашлык", "на", "шампуре"};
        //С помощью циклов и функции String.substring составить итоговый текст
        //Это-шашлык-на-шампуре
        String str = new String();
        for (String word : words) {
            str += word + "-";
        }

//        System.out.println(str);
//        System.out.println(str.length());
        System.out.println(str.substring(0, 21));
    }

    public static void ex2() {
        System.out.println("Задание №2");
        //Дан массив с массивом чисел внутри
        int[][] arrayOfNumbers = new int[10][10];
        arrayOfNumbers[0] = new int[]{131, 1, 1, 1, 1, 1, 1, 1, 1, 102};
        arrayOfNumbers[1] = new int[]{1, 20, 1, 1, 1, 1, 1, 1, 93, 1};
        arrayOfNumbers[2] = new int[]{1, 1, 31, 1, 1, 1, 1, 81, 1, 1};
        arrayOfNumbers[3] = new int[]{1, 1, 1, 45, 1, 1, 77, 1, 1, 1};
        arrayOfNumbers[4] = new int[]{1, 1, 1, 1, 57, 67, 1, 1, 1, 1};
        arrayOfNumbers[5] = new int[]{1, 1, 1, 1, 533, 68, 1, 1, 1, 1};
        arrayOfNumbers[6] = new int[]{1, 1, 1, 40, 1, 1, 72, 1, 1, 1};
        arrayOfNumbers[7] = new int[]{1, 1, 30, 1, 1, 1, 1, 83, 1, 1};
        arrayOfNumbers[8] = new int[]{1, 20, 1, 1, 1, 1, 1, 1, 901, 1};
        arrayOfNumbers[9] = new int[]{10, 1, 1, 1, 1, 1, 1, 1, 1, 101};

        //Посчитать сумму каждой диагонали ИСПОЛЬЗУЯ цикл(ы)


        //С левого верхнего угла к нижнему правому
        int leftUpToRightDownSum = 0; //
        //С левого нижнего угла к верхнему правому
        int leftDownToRightUpSum = 0;

        for (int i = 0, j = 0; i < arrayOfNumbers.length; i++, j++) {
            leftUpToRightDownSum += arrayOfNumbers[i][j];
        }
        System.out.println(leftUpToRightDownSum);

        for (int i = 9, j = 0; i >= arrayOfNumbers.length - 10; i--, j++) {
            leftDownToRightUpSum += arrayOfNumbers[i][j];
        }
        System.out.println(leftDownToRightUpSum);
    }

    public static void ex3() {
        System.out.println("Задание №3");
        //Дан распределитель случайных чисел
        Random random = new Random(1);
        //Получение случайного числа
        //int number = random.nextInt(1000);

        for (int i = 1; true; i++) {
            int number = random.nextInt(1000);
            if (number != 999) {
                continue;
            }
            System.out.println("Искомое число: " + number);
            System.out.println("Попытка: " + i);
            break;
        }
    }
}
