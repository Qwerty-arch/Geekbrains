package com.oshovskii.geekbrains.java_1.lesson_06;

public class Cat extends Animal {

    private final int MAX_DISTANCE_RASE = 200;

    public Cat(String name) {
        super(name);
    }

    @Override
    public void animalInfo() {
        System.out.println("Cat's name: " + getName());
    }

    @Override
    public void run(int distance) {
        if (distance > MAX_DISTANCE_RASE) {
            System.out.println("distance > 200 м, cat can't run this distance");
        }
        System.out.println("Cat " + getName() + "run " + distance);
    }

    @Override
    public void swim(int distance) {
        System.out.println("Сat can't swim");
    }
}
