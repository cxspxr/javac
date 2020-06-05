/**
* Patterns practice
* 
* (c) Yaroslav Kasperovhych
* MIT License
* /

package com.company;

import java.util.ArrayList;
import java.util.List;

// Chicken class
class Chicken {
    String name;

    // default constructor
    public Chicken(String name) {
        this.name = name;
    }

    // eating method
    public void eat() {
        System.out.println(String.format("I am chicken %s, i am eating", this.name));
    }
}

// Room class
abstract class Room {
    abstract void join(Room room);
}

// Flat class, abstract factory
abstract class Flat {
    public Flat() {
        Room room1 = makeRoom();
        Room room2 = makeRoom();

        room1.join(room2);
    }

    abstract protected Room makeRoom();
}

// Account class, builder
class Account {
    int age;
    String name;

    // Builder itself
    public static class Builder {
        private int age;
        private String name;

        // Constructor with age
        public Builder(int age) {
            this.age = age;
        }

        // builder method with name
        public Builder withName(String name) {
            this.name = name;

            return this;
        }

        public Account build () {
            Account account = new Account();
            account.age = this.age;
            account.name = this.name;

            return account;
        }
    }

    private Account() {}
}

public class Main {
    // Factory list
    private static List<Chicken> chickensFactory = new ArrayList<>();

    public static void main(String[] args) {
        Chicken chicken1 = makeChicken();
        Chicken chicken2 = makeChicken();

        // factory example
        chickensFactory.add(chicken1);
        chickensFactory.add(chicken2);

        // builder example
        Account account = new Account.Builder(22).withName("Yaroslav Kasperovych").build();

        System.out.println(String.format("Builder factory account name is %s", account.name));
    }

    // factory method
    private static Chicken makeChicken() {
        return new Chicken();
    };
}

