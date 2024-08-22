package org.javaacademy.core.homework.homework4.ex4.animals;

import org.javaacademy.core.homework.homework4.ex4.exception.AliveException;

/**
 * Абстрактный класс "живое"
 */
public abstract class Alive {
    private boolean isDead = false;
    private double weight;

    public Alive(boolean isDead, double weight) {
        this.isDead = isDead;
        this.weight = weight;
    }

    /**
     * Переход в состояние "мёртв"
     */
    public void die() {
        isDead = true;
    }

    /**
     * Выдача ошибки при проверке на жив/мёртв
     */
    public final void cantAnything() throws AliveException {
        if (this.isDead) {
            throw new AliveException("Животное мертво");
        }
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}