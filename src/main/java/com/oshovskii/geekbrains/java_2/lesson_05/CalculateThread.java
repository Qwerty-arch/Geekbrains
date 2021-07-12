package com.oshovskii.geekbrains.java_2.lesson_05;

public class CalculateThread extends Thread {


    private final float[] arr;
    private final int H;

    public CalculateThread(String name, float[] arr, int h) {
        super(name);
        this.arr = arr;
        this.H = h;
        start();
    }

    @Override
    public void run() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + (i + H) / 5) * Math.cos(0.2f +(i + H)/5) * Math.cos(0.4f + (i + H) / 2));
        }

    }
}
