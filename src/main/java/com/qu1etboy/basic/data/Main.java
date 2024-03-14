package com.qu1etboy.basic.data;

import java.util.*;

/**
 * Learn about Data Structure in Java
 * ref: https://ioflood.com/blog/java-data-structures/
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        main.mapHelper();
        main.setHelper();
        main.listHelper();
        main.stackHelper();
        main.queueHelper();
        main.treeMapHelper();
        main.treeSetHelper();
        main.priorityQueueHelper();
    }

    /**
     * HashMap is a collection that stores elements as key-value pairs.
     * It allows you to retrieve a value quickly if you know its key.
     */
    private void mapHelper() {
        Map<String, String> map = new HashMap<>();

        map.put("6410406860", "Weerawong");
        map.put("6410406711", "Napatsorn");
        map.put("6410406860", "Sarut"); // No duplicate key allowed, will replace the value of the existing key.

        for (String key : map.keySet()) {
            System.out.println("[Map] key: " + key + " values: " + map.get(key));
        }
    }

    /**
     * HashSet is a collection that doesn’t allow duplicate elements.
     * It’s especially useful when you want to keep track of unique elements.
     */
    private void setHelper() {
        Set<String> set = new HashSet<>(); // Contain no duplicate

        set.add("Weerawong");
        set.add("Napatsorn");
        set.add("Weerawong");
        set.add("Sarut");

        for (String name : set) {
            System.out.println("[Set] value: " + name);
        }
    }

    /**
     * ArrayList is one of the most commonly used data structures in Java.
     * It’s a dynamic array that can grow and shrink in size automatically.
     * It allows you to store any number of elements and can contain duplicates.
     */
    private void listHelper() {
        List<String> list = new ArrayList<>();

        list.add("Weerawong");
        list.add("Napatsorn");
        list.add("Weerawong");
        list.add("Sarut");

        for (String name : list) {
            System.out.println("[List] value: " + name);
        }
    }

    /**
     * A Stack is a Last-In-First-Out (LIFO) data structure.
     * It’s like a stack of plates; the last plate put on the stack
     * is the first one to be used.
     */
    private void stackHelper() {
        Stack<String> stack = new Stack<>(); // LIFO

        stack.add("a");
        stack.add("b");
        stack.add("c");


        while (!stack.isEmpty()) {
            String value = stack.pop();
            System.out.println("[Stack] value: " + value);
        }
    }

    /**
     * A Queue is a First-In-First-Out (FIFO) data structure.
     * It’s like a real-world queue; the first person who joins
     * the queue is the first one to leave.
     */
    private void queueHelper() {
        Queue<String> queue = new LinkedList<>(); // FIFO

        queue.add("a");
        queue.add("b");
        queue.add("c");

        queue.remove(); // remove 'a'

        for (String value : queue) {
            System.out.println("[Queue] value: " + value);
        }
    }

    /**
     * TreeMap is a collection that stores key-value pairs in a sorted order.
     * It’s a good choice when you need to maintain a sorted map.
     */
    private void treeMapHelper() {
        Map<String, String> treeMap = new TreeMap<>(); // key will be sorted

        treeMap.put("6410406711", "Napatsorn");
        treeMap.put("6410406860", "Weerawong");
        treeMap.put("6410401183", "Sittipong");

        for (String key : treeMap.keySet()) {
            System.out.println("[TreeMap] key: " + key + " value: " + treeMap.get(key));
        }
    }

    /**
     * TreeSet is a collection that stores unique elements in a sorted order.
     * It’s useful when you need to maintain a sorted set of unique elements.
     */
    private void treeSetHelper() {
        Set<String> treeSet = new TreeSet<>();

        treeSet.add("Weerawong");
        treeSet.add("Napatsorn");
        treeSet.add("Sittipong");

        for (String name : treeSet) {
            System.out.println("[TreeSet] value: " + name);
        }
    }

    /**
     * PriorityQueue is a collection that order its elements
     * based on their natural ordering or a custom comparator.
     * It’s useful when you need to process elements based on their priority.
     */
    private void priorityQueueHelper() {
        Queue<String> pq = new PriorityQueue<>();

        pq.add("Weerawong");
        pq.add("Sittipong");
        pq.add("Napatsorn");

        System.out.println("[PriorityQueue] top: " + pq.peek());
    }
}