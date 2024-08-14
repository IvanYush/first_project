package org.javaacademy.core.homework.homework2.office;

public class Security {
    String name;

    public Security(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void avans(Security security) {
        System.out.println(security.getName() + ": \"Выдайте мне аванс!\"");
    }
}
