package org.javaacademy.core.homework.homework5.ex2;

import java.io.IOException;
import java.util.Scanner;

/**
 * Компьютер
 */
public class Computer {

    private User user = new User(null);

    public Computer() {
    }

    public void login() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя пользователя:");
        String name = scanner.nextLine();
        user.setName(name);
    }

    public void logout() throws IOException {
        user.setName(null);
    }

    public String printMessage() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст сообщения:");
        String text = scanner.nextLine();
        System.out.println("сообщение: " + text);
        return text;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}