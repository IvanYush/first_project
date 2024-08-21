package org.javaacademy.core.homework.homework4.ex4.runner;

import org.javaacademy.core.homework.homework4.ex4.animals.*;

public class Runner {
    public static void main(String[] args) {
        Tiger tiger = new Tiger(false, 300);
        Wolf wolf = new Wolf(false, 50);
        Rabbit rabbit = new Rabbit(false, 2);
        Elephant elephant = new Elephant(false, 2000);

        rabbit.run();
        wolf.attack(rabbit);
        tiger.attack(wolf);
        tiger.attack(elephant);
        elephant.run();
        rabbit.run();
    }
}