package com.company;

interface Introducable {
    public void introduce();
}

interface Imaginable {
    public void imagine();
}


public class Kasperovych extends Person implements Introducable, Imaginable {
    public Kasperovych(String name, int age) {
        super(name, age);

        this.age = 22;
        this.name = "Yaroslav Kasperovych";
    }

    public void introduce() {
        System.out.println("I am inherited class");
    }

    public void imagine() {
        System.out.println("I am Elon Musk");
    }
}
