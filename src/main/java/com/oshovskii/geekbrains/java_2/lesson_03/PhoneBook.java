package com.oshovskii.geekbrains.java_2.lesson_03;

import java.util.*;

public class PhoneBook {

    Map<String, ArrayList<Person>> phoneBook = new HashMap<>();

    public void initializationCollection() {
        Person[] persons = {
                new Person("Abramson", "qwerty@yandex.ru", "+1 234 346 531"),
                new Person("Black", "Happy@gmail.ru", "020-30303030"),
                new Person("Carroll", "ooos@yandex.ru", "011-20000198"),
                new Person("Abramson", "QWERTY@mail.ru", "+30 210 090 7777")
        };

        for (Person person : persons) {
            if (!phoneBook.containsKey(person.getLastName())) {
                phoneBook.put(person.getLastName(), new ArrayList<>());
            }
            phoneBook.get(person.getLastName()).add(person);
        }
    }

    public ArrayList<String> findPhoneNumber(String numberScanner) {
        ArrayList<String> phoneList = new ArrayList<>();
        if (phoneBook.containsKey(numberScanner)) {
            for (Person person : phoneBook.get(numberScanner)) {
                phoneList.add(person.getPhone());
            }
        }
        return phoneList;
    }

    public ArrayList<String> findEmailNumber(String numberScanner) {
        ArrayList<String> emailList = new ArrayList<>();
        if (phoneBook.containsKey(numberScanner)) {
            for (Person person : phoneBook.get(numberScanner)) {
                emailList.add(person.getEmail());
            }
        }
        return emailList;
    }
}
