/**
* Class creation practice
* 
* (c) Yaroslav Kasperovhych
* MIT License
* /

package com.company;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
