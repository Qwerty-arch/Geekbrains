package com.oshovskii.geekbrains.java_1.lesson_02;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkNumbers(10, 5));
        whatNumber(-1000);
        System.out.println(positiveOrNegative(9));
        writeString("Hello, World!", 2);
        whatYear(2000);
    }

    public static boolean checkNumbers(int a, int b) {
        int result = a + b;
        return  (result >= 10 && result <= 20);
    }

    public static void whatNumber(int a) {
        if (a >= 0) {
            System.out.println("Это положительное число");
        } else {
            System.out.println("Это отрицательное число");
        }
    }

    public static boolean positiveOrNegative(int a) {
        return a < 0;
    }

    public static void writeString(String a, int count) {
        if (count < 0) {
            throw new IllegalArgumentException("Negative number");
        }
        for (int i = 0; i < count; i++) {
            System.out.println(a);
        }
    }

    public static void whatYear(int year) {
        if (year < 0) {
            throw new IllegalArgumentException("Negative year");
        }
        if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
            System.out.println("Это обычный год");
        } else {
            System.out.println("Это високосный год");
        }
    }
}
