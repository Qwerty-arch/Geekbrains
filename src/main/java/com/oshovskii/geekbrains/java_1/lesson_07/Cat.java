package com.oshovskii.geekbrains.java_1.lesson_07;

public class Cat {
    private final String cat_name;
    private final int appetite;
    private boolean satiety;

    public Cat(String cat_name, int appetite, boolean satiety) {
        this.cat_name = cat_name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate p) {
        System.out.println("Аппетит кота: " + appetite + " единиц еды");
        if (appetite > p.getCapacity() && p.getCapacity() > 0) {
            p.setCapacity(appetite - p.getCapacity() );
            System.out.println(cat_name + " кушает...");
            System.out.println("В тарелке не осталось еды! Кот остался голодным на: " + p.getCapacity() + " единиц еды");
            System.out.println(false);
        } else if (appetite < p.getCapacity()){
            p.setCapacity(p.getCapacity() - appetite);
            System.out.println(cat_name + " кушает...");
            System.out.println("В тарелке осталось: " + p.getCapacity() + " единиц еды");
            System.out.println(true);
        } else {
            p.setCapacity(p.getCapacity() - appetite);
            System.out.println("Кот обиделся");
        }
    }
}
