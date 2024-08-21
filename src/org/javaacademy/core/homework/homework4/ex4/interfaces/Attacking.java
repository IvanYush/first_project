package org.javaacademy.core.homework.homework4.ex4.interfaces;

import org.javaacademy.core.homework.homework4.ex4.animals.Alive;
import org.javaacademy.core.homework.homework4.ex4.exception.AliveException;

/**
 * Интерфейс "атакующие"
 */
public interface Attacking {

    void attack(Alive anotherAlive);
}