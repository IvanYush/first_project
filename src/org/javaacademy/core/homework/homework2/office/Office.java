package org.javaacademy.core.homework.homework2.office;

import java.util.Scanner;

public class Office {
    Scanner scanner = new Scanner(System.in);

    String name;

    public Office(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void workDay(Boss boss, Manager manager, Secretary secretary, Security security, Office office) {
        System.out.println("Запустить рабочий день? (да/нет)");
        String yesOrNo = scanner.nextLine();

        if (yesOrNo.equalsIgnoreCase("да")) {
            System.out.println("Рабочий день в фирме \"" + office.getName() + "\" начался!");
            boss.faster(boss, manager);
            manager.help(manager);
            security.avans(security);
            secretary.dontWorry(secretary, boss, manager, security);
        } else if (yesOrNo.equalsIgnoreCase("нет")) {
            System.out.println("ну и ладно");
        } else {
            System.out.println("я же просил \"да\" или \"нет\"");
        }
    }
}