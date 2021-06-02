package com.oshovskii.geekbrains.java_1.lesson_06;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    private static final Map<Integer, String> counterMap = new LinkedHashMap<>();

    public static void main(String[] args) {

        Animal barsik = new Cat("Barsik");
        counterMap.putIfAbsent(1,barsik.getName());
        barsik.run(20);
        barsik.swim(10);
        barsik.animalInfo();
        System.out.println();

        Animal barbos = new Dog("Barbos");
        counterMap.putIfAbsent(2,barbos.getName());
        barbos.run(500);
        barbos.swim(10);
        barbos.animalInfo();
        System.out.println();

        Animal sharik = new Dog("Sharik");
        counterMap.putIfAbsent(3,sharik.getName());
        sharik.run(600);
        sharik.swim(100);
        sharik.animalInfo();

        System.out.println("total of " + counter() + " (animals)\n" + counterMap.entrySet());
    }

    private static int counter(){
        int lastKey = 0;
        for (Map.Entry<Integer, String> entry : counterMap.entrySet()) {
            lastKey = entry.getKey();
        }
        return lastKey;
    }
}