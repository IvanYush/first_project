package org.javaacademy.core.homework.homework4.ex4.animals;

import org.javaacademy.core.homework.homework4.ex4.exception.AliveException;
import org.javaacademy.core.homework.homework4.ex4.interfaces.Running;

/**
 * Класс слона
 */
public class Elephant extends Alive implements Running {

    public Elephant(boolean isDead, double weight) {
        super(isDead, weight);
    }

    @Override
    public void run() {
        try {
            this.cantAnything();
            System.out.println("слон медленно бежит");
        } catch (AliveException e) {
            System.out.println("Животное не может бегать");
        }
    }
}