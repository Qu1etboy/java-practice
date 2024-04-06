package com.qu1etboy.basic.algo.search;

public class Main {

    public static void main(String[] args) {
        ArrayLinkedList people = new ArrayLinkedList();
        people.add("Alice");
        people.add("Alex");
        people.add("Bob");
        people.add("Charlie");
        people.add("David");

        System.out.println(people.search("Alice"));
        System.out.println(people.search("Tom"));
    }
}
