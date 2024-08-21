package org.javaacademy.core.homework.homework4.ex4.animals;

import org.javaacademy.core.homework.homework4.ex4.exception.AliveException;
import org.javaacademy.core.homework.homework4.ex4.interfaces.Attacking;

/**
 * Класс тигра
 */
public class Tiger extends Alive implements Attacking {

    public Tiger(boolean isDead, double weight) {
        super(isDead, weight);
    }

    @Override
    public void attack(Alive anotherAlive) {
        try {
            this.cantAnything();
            if (anotherAlive.getWeight() * 2 <= this.getWeight()) {
                anotherAlive.die();
                this.setWeight(Math.round(((this.getWeight() + anotherAlive.getWeight() / 3.0)) * 100.0) / 100.0);
                System.out.println("Вес тигра теперь: " + this.getWeight());
            } else {
                this.die();
                System.out.println("Тигр мёртв");
            }
        } catch (AliveException e) {
            System.out.println("Животное не может нападать");
        }
    }
}