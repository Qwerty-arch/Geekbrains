package com.oshovskii.geekbrains.java_3.lesson_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BoxWithFruits<T extends Fruit> {
    private List<T> fruits;
    private float sum;

    public BoxWithFruits (T... fruits){
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fruits);
        this.fruits = arrayList;
    }

    public BoxWithFruits() {
        this.fruits = new ArrayList<>();
    }

    private float getWeight(){
        if (fruits.size() == 0) {
            sum = 0.0f;
            return sum;
        }
        sum = 0.0f;
        for (T fruit : fruits) {
            sum += fruit.getWeight();
        }
        return sum;
    }

    private boolean compare(BoxWithFruits<?> box2) {
        return this.getWeight() == box2.getWeight();
    }

    private void swapFruits (BoxWithFruits<T> box2) {
        if (this == box2) {
            return;
        }
        box2.fruits.addAll(this.fruits);
        this.fruits.clear();
    }

    private void addFruit (T fruit) {
        this.fruits.add(fruit);
    }


}


