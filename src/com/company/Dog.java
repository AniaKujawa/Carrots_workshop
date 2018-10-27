package com.company;

public class Dog {
    String name;
    private int numberOfLegs;

    public Dog(String name) {
        this(); //wywołuje Dog(), można też z parametrem :)
        this.name = name;
    }

    public Dog() {
        this.numberOfLegs = 4;
    }

    public void bark(){
        System.out.println("hau hau");
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public static void sayHau() {
        System.out.println("hau!");
    }
}
