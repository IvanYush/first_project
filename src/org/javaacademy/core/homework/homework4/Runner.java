package org.javaacademy.core.homework.homework4;

import org.javaacademy.core.homework.homework4.ex1.CarWash;
import org.javaacademy.core.homework.homework4.ex1.vehicle.Bus;
import org.javaacademy.core.homework.homework4.ex1.vehicle.LightCar;
import org.javaacademy.core.homework.homework4.ex1.vehicle.Vehicle;
import org.javaacademy.core.homework.homework4.ex2.Airplane;
import org.javaacademy.core.homework.homework4.ex2.Duck;
import org.javaacademy.core.homework.homework4.ex2.FlyException;
import org.javaacademy.core.homework.homework4.ex3.*;

public class Runner {
    public static void main(String[] args) {
//        ex3();
//        ex2();
//        ex1();
    }


    public static void ex1() {

        CarWash carWash = new CarWash();

        Vehicle[] vehicles = new Vehicle[9];
        vehicles[0] = new LightCar(false, 5, 2, 1.8, true);
        vehicles[1] = new LightCar(false, 5, 2, 1.8, true);
        vehicles[2] = new LightCar(false, 5, 2, 1.8, true);
        vehicles[3] = new LightCar(false, 5, 2, 1.8, true);
        vehicles[4] = new Bus(false, 12, 3, 2.3, 10);
        vehicles[5] = new Bus(false, 12, 3, 2.3, 10);
        vehicles[6] = new Bus(false, 12, 3, 2.3, 10);
        vehicles[7] = new Bus(false, 12, 3, 2.3, 10);
        vehicles[8] = new Bus(false, 12, 3, 2.3, 10);

        System.out.println(carWash.washCars(vehicles));
    }

    public static void ex2() {

        Duck duck1 = new Duck(false);
        Duck duck2 = new Duck(true);
        Airplane airplane1 = new Airplane(10);
        Airplane airplane2 = new Airplane(-1);

        try {
            duck1.fly();
            duck2.fly();
        } catch (FlyException e) {
            System.out.println(e.getMessage());
        }
        try {
            airplane1.fly();
            airplane2.fly();
        } catch (FlyException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void ex3() {
        MakeSound builder = new Builder();
        MakeSound human = new Human();
        MakeSound driver = new Driver();
        MakeSound bird = new Bird();

        MakeSound[] makeSound = new MakeSound[4];
        makeSound[0] = human;
        makeSound[1] = builder;
        makeSound[2] = driver;
        makeSound[3] = bird;

        for (MakeSound sound : makeSound) {
            sound.sound();
            System.out.println("_____");
        }
    }

    public static void ex4() {
            //Задача №4 - Страсти по Дарвину
            //Создать следующую структуру
            //             Живое
            //       /             \
            //    Хищник             Травоядное
            //    /   \              /         \
            // волк   тигр       кролик        слон
            //
            //Живое - обладает свойством жив/мертв, вес. Умеет умирать - переход в состояние мертв.
            //
            //Хищник
            //Умеет нападать на живое. В случае если вес жертвы больше хищника, то хищник погибает,
            //иначе вес хищника увеличивается на треть веса жертвы и жертва погибает.
            //Может нападать только при живом состоянии, иначе выпадает ошибка "Животное не может нападать".
            //
            //Травоядное - умеет бегать (не определено как).
            // Но все травоядные могут бегать только в состоянии живое.
            //Иначе выдает ошибку - "Животное не может бегать".
            //
            //Тигр умеет нападать на живое, но за счет ловкости может сьесть жертву весом до двух раз больше него.
            //Остальные условия такие же как при нападении хищника.
            //
            //Волк - не обладает уникальными свойствами или действиями.
            //Кролик - умеет бегать (печать "кролик быстро бежит")
            //Слон - умеет бегать (печать "слон медленно бежит")
            //
            //Создать отдельный пакет и Runner. В Runner:
            //1.Создать Тигра(300 кг), Волка(50 кг), кролика(2 кг), Слона (2000 кг)
            //2.Кролик должен пробежать
            //3.Волк ест кролика
            //4.Тигр ест волка
            //5.Тигр пытается съесть слона
            //6.Слон пробегает
            //7.Вызвать у съеденного кролика бег, сделать так, чтобы программа НЕ закончилась с ошибкой,
            //а распечатала текст ошибки.
    }
}