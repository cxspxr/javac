package com.company;

public class Kasperovych extends Person {
    public Kasperovych(String name, int age) {
        super(name, age);

        this.age = 22;
        this.name = "Yaroslav Kasperovych";
    }
    
    public void introduce() {
        System.out.println("I am inherited class");
    }
}
