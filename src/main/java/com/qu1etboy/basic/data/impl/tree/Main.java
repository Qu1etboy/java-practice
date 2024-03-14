package com.qu1etboy.basic.data.impl.tree;

public class Main {
    public static void main(String[] args) {
        Tree bst = new BinarySearchTree();
        int[] values = { 50, 20, 30, 10, 80, 60 };

        for (int value :  values) {
            bst.insert(value);
        }

        bst.inOrder();
    }
}
