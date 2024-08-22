package org.javaacademy.core.homework.homework4.ex4.animals;

import org.javaacademy.core.homework.homework4.ex4.exception.AliveException;
import org.javaacademy.core.homework.homework4.ex4.interfaces.Attacking;

/**
 * Класс волка
 */
public class Wolf extends Alive implements Attacking {

    public Wolf(boolean isDead, double weight) {
        super(isDead, weight);
    }

    @Override
    public void attack(Alive anotherAlive) {
        try {
            this.cantAnything();
            if (this.getWeight() > anotherAlive.getWeight() || anotherAlive.isDead()) {
                this.setWeight(Math.round(((this.getWeight() + anotherAlive.getWeight() / 3.0)) * 100.0) / 100.0);
                anotherAlive.die();
                System.out.println("Вес волка теперь: " + this.getWeight());
            } else {
                this.die();
                System.out.println("Волк мёртв");
            }
        } catch (AliveException e) {
            System.out.println("Животное не может нападать");
        }
    }
}