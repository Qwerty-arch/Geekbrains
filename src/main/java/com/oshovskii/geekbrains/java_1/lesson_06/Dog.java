package com.oshovskii.geekbrains.java_1.lesson_06;

public class Dog extends Animal {

    private final int MAX_DISTANCE_RASE = 500;
    private final int MAX_DISTANCE_SWIM = 10;

    public Dog(String name) {
        super(name);
    }

    @Override
    public void animalInfo() {
        System.out.println("Dog's name: " + getName());
    }

    @Override
    public void run(int distance) {
        if (distance > MAX_DISTANCE_RASE) {
            System.out.println("distance > 500 м, dog can't run this distance");
            return;
        }
        System.out.println("Dog " + getName() + "run " + distance);
    }

    @Override
    public void swim(int distance) {
        if (distance > MAX_DISTANCE_SWIM) {
            System.out.println("distance > 10 м, dog can't swim this distance");
            return;
        }
        System.out.println("Dog " + getName() + " swim " + distance + " м");
    }
}