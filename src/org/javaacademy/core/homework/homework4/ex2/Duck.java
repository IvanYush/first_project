package org.javaacademy.core.homework.homework4.ex2;

/**
 * Утка
 */
public class Duck implements Flyable {
    private boolean isInjured = true;

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    @Override
    public void fly() throws FlyException {
        if (isInjured) {
            throw new FlyException("Ошибка: утка ранена");
        }
        System.out.println("утка летит");
    }
}