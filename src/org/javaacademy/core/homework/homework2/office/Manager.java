package org.javaacademy.core.homework.homework2.office;

public class Manager {
    String name;

    public Manager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void help(Manager manager) {
        System.out.println(manager.getName() + ": \"Я ничего не успеваю, помогите!\"");
    }
}
