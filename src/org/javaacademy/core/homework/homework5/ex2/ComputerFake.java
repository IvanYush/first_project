package org.javaacademy.core.homework.homework5.ex2;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Компьютер фэйк
 */
public class ComputerFake extends Computer {
    private Computer computer;

    public ComputerFake(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void login() throws IOException {
        super.login();
        FileWriter fileWriter = new FileWriter("comp.log", true);
        fileWriter.write("Пользователь " + getUser().getName() + " вошёл\n");
        fileWriter.close();
    }

    @Override
    public void logout() throws IOException {
        super.logout();
        FileWriter fileWriter = new FileWriter("comp.log", true);
        fileWriter.write("Пользователь вышёл\n");
        fileWriter.close();
    }

    @Override
    public String printMessage() throws IOException {
        FileWriter fileWriter = new FileWriter("comp.log", true);
        fileWriter.write("Пользователь " + getUser().getName() + " отправил сообщение " + super.printMessage() + "\n");
        fileWriter.close();
        return null;
    }
}