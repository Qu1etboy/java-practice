package com.qu1etboy.basic.algo.search;

import java.util.LinkedList;

public class ArrayLinkedList {
    public static final int SIZE = 26;
    private LinkedList<String>[] list;

    public ArrayLinkedList() {
        list = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            list[i] = new LinkedList<>();
        }
    }

    private int getIndex(String word) {
        return Character.toLowerCase(word.charAt(0)) - 'a';
    }

    public void add(String word) {
        list[getIndex(word)].add(word);
    }

    public boolean search(String word) {
        return list[getIndex(word)].contains(word);
    }
}