package org.javaacademy.core.homework;

public class Homework1 {
    public static void main(String[] args) {
        ex2();
        System.out.println("___________________________________________");
        ex3();
        System.out.println("___________________________________________");
        ex4();
    }

    /*
        public static void ex1() {
            //Написал отдельным классом.
        }
    */
    public static void ex2() {
        //Дана строка
        String name = "     ПЕтРов Олег Иванович     ";

        name = name.trim();
        System.out.println("Обрезка строки от пробелов: " + name);

        name = name.toUpperCase();
        System.out.println("Перевод текста в верхний регистр: " + name);

        //условие на "ОВА " "ОВ "
        if (name.contains("ОВА ")) {
            System.out.println("Уважаемая " + name);
        } else if (name.contains("ОВ ")) {
            System.out.println("Уважаемый " + name);
        } else {
            System.out.println("Неизвестное лицо " + name);
        }
    }

    public static void ex3() {
        double fuel = 10;
        boolean isEngineWork = true;
        boolean hasErrors = false; // где-то читал что название переменной boolean надо начинать с "is". Так ли это?
        boolean isWheelWork1 = true;
        boolean isWheelWork2 = true;
        boolean isWheelWork3 = true;
        boolean isWheelWork4 = true;

        if (fuel >= 10 && (isWheelWork1 && isWheelWork2 && isWheelWork3 && isWheelWork4) && !hasErrors && isEngineWork) {
            System.out.println("Машина едет");
        } else {
            System.out.println("Машина не едет");
        }
    }

    public static void ex4() {

        String simply = "this is simply. This is my favorite song.";

        simply = simply.replaceFirst("this is", "Those are");
        System.out.println(simply);

        //ищем когда буква "о" встречается в первый раз
        int index1 = simply.indexOf("o");
        System.out.println("Первый раз буква \"о\" встречается: " + index1);

        // ищем когда буква "о" встречается во второй раз, начиная поиск со следующего символа после первой "о"
        int index2 = simply.indexOf("o", index1 + 1);
        System.out.println("Второй раз буква \"о\" встречается: " + index2);
    }
}
