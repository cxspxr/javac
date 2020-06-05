/**
* Inheritance practice
* 
* (c) Yaroslav Kasperovhych
* MIT License
* /

package com.company;

// Person class was in class_creation.java task, this is just continuation of that task
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
