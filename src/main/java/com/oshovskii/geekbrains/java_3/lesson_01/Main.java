package com.oshovskii.geekbrains.java_3.lesson_01;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

    }

    private static <T> void swapElement(T[] arr, int index1, int index2) {
        if (index1 == index2) {
            return;
        }
        T obj = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = obj;
    }

    private static <T>ArrayList<T> arrayToArrayList(T[] arr){
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, arr);
        return arrayList;
    }
}
