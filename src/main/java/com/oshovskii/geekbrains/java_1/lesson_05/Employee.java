package com.oshovskii.geekbrains.java_1.lesson_05;

public class Employee {

    private int id;
    private String name;
    private String occupation;
    private String mail;
    private String phone_number;
    private int salary;
    private int age;


    public Employee(int id, String fio, String occupation, String mail, String phone_number, int salary, int age) {
        this.id = id;
        this.name = fio;
        this.occupation = occupation;
        this.mail = mail;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "id: " + this.id + " | name: " + this.name + " | occupation: " + this.occupation + " | mail: " + this.mail + " | phone_number: " + this.phone_number + " | salary: " + this.salary + " | age: " + this.age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
