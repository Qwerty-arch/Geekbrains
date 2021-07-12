package com.oshovskii.geekbrains.java_2.lesson_03;

import java.util.*;

public class MyCollection {

    private static String[] arrayFruits =
            {
                    "apple", "banana", "apricot", "avocado", "kiwi", "lime",
                    "grapes", "grapefruit", "apricot", "nectarine", "papaya",
                    "pear", "watermelon", "tangerine", "quince", "pomegranate",
                    "persimmon", "blueberry", "cherry", "blackberry", "strawberry",
                    "strawberry", "strawberry", "cherry", "cherry", "apple"
            };

    public static void main(String[] args) {

        System.out.println("********************************************************************");

        System.out.println("");
        System.out.println("Выводим список всех неповторяющихся элементов из массива фруктов: ");
        System.out.println(ListOfFruits(arrayFruits));
        System.out.println("");

        System.out.println("********************************************************************");

        Map<String, Integer> mapOfFruits = new HashMap();
        for (String arrayFruits : arrayFruits) {
            if(!arrayFruits.isEmpty()) {
                Integer count = mapOfFruits.get(arrayFruits);
                if(count == null) {
                    count = 0;
                }
                mapOfFruits.put(arrayFruits, ++count);
            }
        }
        for (String word : mapOfFruits.keySet()) {
            System.out.println(" [ " + word + " ] " + " in a quantity of : " + mapOfFruits.get(word));
        }

        checkPhoneBook();
    }

    public static Set ListOfFruits(String[] arrayFruits) {
        Set collection = new HashSet();
        for (int i = 0; i < arrayFruits.length; i++) {
            collection.add(arrayFruits[i]);
        }
        return collection;
    }

    public static void checkPhoneBook(){
        System.out.println("********************************************************************");

        System.out.print("Кто вас интересует(phone): \n 1. Abramson \n 2. Black \n 3. Carroll\n 4. Abramson \n Незамедлительно введите фамилию: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.initializationCollection();
        System.out.println("Phone : " + phoneBook.findPhoneNumber(str));

        System.out.println("********************************************************************");

        System.out.print("Кто вас интересует(email): \n 1. Abramson \n 2. Black \n 3. Carroll\n 4. Abramson \n Незамедлительно введите фамилию: ");
        String number2 = scan.nextLine();
        System.out.println("Email : "+ phoneBook.findEmailNumber(number2));

        System.out.println("********************************************************************");
    }
}