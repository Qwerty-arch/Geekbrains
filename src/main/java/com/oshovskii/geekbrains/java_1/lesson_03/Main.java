package com.oshovskii.geekbrains.java_1.lesson_03;

import java.util.Arrays;

public class Main {
    private static final int[] array = {1,2,3,1,2,3};

    public static void main(String[] args) {
        System.out.println("Exercise №1: ");
        swapArray();
        System.out.println();
        System.out.println("Exercise №2: ");
        createArray();
        System.out.println();
        System.out.println("Exercise №3: ");
        changeArray();
        System.out.println();
        System.out.println("Exercise №4: ");
        createSquareArray();
        System.out.println("Exercise №5: ");
        System.out.println(Arrays.toString(fillArray(9, -999)));
        System.out.println("Exercise №6: ");
        System.out.println(checkBalance(array));
        System.out.println("Exercise №7: ");
        findMaxOrMin();
        System.out.println("Exercise №8: ");
        modifyArray(array,2);
    }


    public static void swapArray() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i]--;
            } else {
                array[i]++;
            }
            System.out.print(array[i] + " ");
        }
    }


    public static void createArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.print(array[i] + " ");
        }
    }

    public static void changeArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
            System.out.print(array[i] + " ");
        }
    }

    public static void createSquareArray() {
        int length = 5;

        int[][] arr = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if ((i == j) || (i == length - 1 - j)) {
                    arr[i][j] = 1;
                }
            }
        }
        showArray(arr);
    }

    private static void showArray( int[][] arr){
        for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
        }
    }

    public static int[] fillArray(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }

    public static void findMaxOrMin() {
        int[] array = {3, 76, 23, 12, 64, 2, 6, 7, 8};
        int minValue = array[0];
        int maxValue = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }

        for (int j = 0; j < array.length; j++) {
            if (array[j] > maxValue) {
                maxValue = array[j];
            }
        }
        System.out.println("Минимальное значение: " + minValue);
        System.out.println("Максимальное значение: " + maxValue);
    }

    public static boolean checkBalance(int[] array) {
        if (isArrayEmpty(array)) {
            throw new IllegalArgumentException(" Array is empty!");
        }
        int leftSum;
        int rightSum;

    for (int i = 0; i < array.length + 1; i++) {
        leftSum = 0;
        rightSum = 0;

        for (int j = 0; j < i; j++) {
            leftSum += array[j];
        }

        for (int j = i; j < array.length; j++) {
            rightSum += array[j];
        }

        if (leftSum == rightSum)
            return true;
    }
        return false;
    }

    private static boolean isArrayEmpty(int[] array) {
        return array.length == 0;
    }

    public static void modifyArray(int[] array, int n) {
        System.out.print("BEFORE: ");
        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.print("(n = " + n + ")");

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                // Right
                int tmp = array[array.length - 1];
                for (int j = array.length - 1; j > 0; j--) {
                    array[j] = array[j - 1];
                }
                array[0] = tmp;
            }
        } else if (n < 0) {
            for (int i = 0; i < n * (-1); i++) {
                // Left
                int temp = array[0];
                for (int j = 0; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = temp;
            }
        }

        System.out.print("\nAFTER:  ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
