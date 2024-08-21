package org.javaacademy.core.homework.homework4.ex3;

/**
 * Строитель
 */
public class Builder extends Human {

    @Override
    public void sound() {
        System.out.println("Я строитель.");
        super.sound();
    }
}