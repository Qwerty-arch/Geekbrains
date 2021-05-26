package com.oshovskii.geekbrains.java_1.lesson_05;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Maria Hill", "developer", "mail@mail.ru", "+79999996666", 999999, 26);
        System.out.println(employee.toString());
        System.out.println();
        System.out.println("Вывести работников, чей возраст старше 40 лет:\n");

        Employee[] employees = new Employee[5];
        employees[0] = new Employee(2, "Harry Smith", "frontend developer", "mail1@mail.ru", "+99999999966", 100000, 41);
        employees[1] = new Employee(3, "Oliver Jones", "backend developer", "mail2@mail.ru", "+39999996666", 110000, 35);
        employees[2] = new Employee(4, "Jack Williams", "full stack developer", "mail3@mail.ru", "+19999996666", 120000, 50);
        employees[3] = new Employee(5, "Charlie Taylor", "full stack developer", "mail4@mail.ru", "+59999996666", 130000, 60);
        employees[4] = new Employee(6, "Thomas Brown", "super developer", "mail5@mail.ru", "+99999996666", 140000, 20);

        for (Employee value : employees) {
            if (value.getAge() > 40) {
                System.out.println(value.toString());
            }
        }
    }
}
