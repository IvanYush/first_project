package org.javaacademy.core.homework.homework2.office;

public class Runner {
    public static void main(String[] args) {

        Boss boss = new Boss("Пётр Николаевич");
        Manager manager = new Manager("Володя");
        Security security = new Security("Петрович");
        Secretary secretary = new Secretary("Секретарь");
        Office office = new Office("Рога и копыта");

        office.workDay(boss, manager, secretary,security, office);

    }
}