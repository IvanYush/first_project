package org.javaacademy.core.homework.homework2.office;

public class Boss {
    String name;

    public Boss(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void faster(Boss boss, Manager manager) {
        System.out.println(boss.getName() + ": \"" + manager.getName() + ", быстрее!\"");
    }
}