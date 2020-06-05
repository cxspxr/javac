  
/**
* Collections practice
* 
* (c) Yaroslav Kasperovhych
* MIT License
* /

package com.company;

import java.util.*;
import java.util.function.Supplier;

class Person {
    int number;

    public Person(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return String.format("%s", number);
    }
}

// Process model class
class Model<T extends AbstractList<Person>> {
    T list;

    protected Model(int n, Supplier<? extends T> ctor) {
        this.list = Objects.requireNonNull(ctor).get();

        // initializing n-size person array
        for(int i = 1; i <= n; i++) {
            list.add(new Person(i));
        }
    }

    // modeling method
    public void model() {
        for (int i = 0; i < list.size(); i++) {
            if ((i & 1) == 1) {
                list.remove(i);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // defining 2 models for benchmarking
        Model<ArrayList<Person>> arrayListModel = new Model<>(5, ArrayList::new);
        Model<LinkedList<Person>> linkedListModel = new Model<>(5, LinkedList::new);

        // Benchmarking of arraylist
        long arrayListStartTime = System.nanoTime();
        arrayListModel.model();
        long arrayListEndTime = System.nanoTime();

        // Benchmarking of linkedlist
        long linkedListStartTime = System.nanoTime();
        linkedListModel.model();
        long linkedListEndTime = System.nanoTime();

        // Printing results
        System.out.println(String.format("Array list model: %s, time consumed is %s nanoseconds", Arrays.toString(arrayListModel.list.toArray()), arrayListEndTime - arrayListStartTime));
        System.out.println(String.format("Linked list model: %s, time consumed is %s nanoseconds", Arrays.toString(linkedListModel.list.toArray()), linkedListEndTime - linkedListStartTime));

        System.out.println("Linked list model is faster because it utilizes memory pointers navigation");
    }
}

