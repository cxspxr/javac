package com.company;

import java.util.ArrayList;
import java.util.List;

class Chicken {
    String name;

    public Chicken(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(String.format("I am chicken %s, i am eating", this.name));
    }
}

abstract class Room {
    abstract void join(Room room);
}

abstract class Flat {
    public Flat() {
        Room room1 = makeRoom();
        Room room2 = makeRoom();

        room1.join(room2);
    }

    abstract protected Room makeRoom();
}

class Account {
    int age;
    String name;

    public static class Builder {
        private int age;
        private String name;

        public Builder(int age) {
            this.age = age;
        }

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
    private static List<Chicken> chickensFactory = new ArrayList<>();

    public static void main(String[] args) {
        Chicken chicken1 = makeChicken();
        Chicken chicken2 = makeChicken();

        chickensFactory.add(chicken1);
        chickensFactory.add(chicken2);

        Account account = new Account.Builder(22).withName("Yaroslav Kasperovych").build();

        System.out.println(String.format("Builder factory account name is %s", account.name));
    }

    private static Chicken makeChicken() {
        return new Chicken();
    };
}

