/**
* Polymorphism practice
* 
* (c) Yaroslav Kasperovhych
* MIT License
* /

package com.company;

import java.util.Objects;

interface Introducable {
    public void introduce();
}

interface Imaginable {
    public void imagine();
}

// Class Person
public class Person {
    int age;
    String name;
    // common constructor
    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }
    // method of speaking 
    public void say(String what) {
        System.out.println(what);
    }
    
    // method of barking 
    public void bark() {
        System.out.println("woof woof");
    }
    
    // method of dancing 
    public void dance() {
        System.out.println("I am dancing");
    }
    
    // method of calculating area of a rectangle 
    public double calculateAreaOfARectangle(double a, double b) {
        return a * b;
    }
    
    // method of 2+2 sum
    public int superComplicatedMethod() {
        return 2 + 2;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
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
