package com.oshovskii.geekbrains.java_1.lesson_06;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void animalInfo();

    public abstract void run(int distance);

    public abstract void swim(int distance);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}