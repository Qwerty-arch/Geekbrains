package com.oshovskii.geekbrains.java_1.lesson_07;

import java.util.Scanner;

public class Plate {
    private final String plate_name;
    private int capacity;
    private int add_capacity;

    public Plate(String plate_name, int capacity) {
        this.plate_name = plate_name;
        this.capacity = capacity;
    }

    public void info() {
        if (capacity >= 0) {
            System.out.println("В " + plate_name + " " + capacity + " единиц еды");
        } else {
            System.out.println("В " + plate_name + " 0 единиц еды");
        }
    }

    public void addCapacity() {
        System.out.println("Сколько единиц еды добавляем?");
        Scanner scanner = new Scanner(System.in);
        add_capacity = scanner.nextInt();
        setCapacity(getCapacity() + add_capacity);
        if (this.capacity < 0) {
            System.out.println("Отобрали даже миску...");
            return;
        }
        System.out.println("Добавляем в " + plate_name + " " + add_capacity + " единиц еды");
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
