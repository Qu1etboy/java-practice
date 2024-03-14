package com.qu1etboy.basic.data.impl.tree;

public abstract class Tree {
    private Node root;

    public void insert(int value) {
        if (root == null) {
            root = insert(root, value);
        } else {
            insert(root, value);
        }
    }

    protected abstract Node insert(Node node, int value);

    public void inOrder() {
        inOrder(this.root);
    }

    private void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.value + " ");
            inOrder(root.right);
        }
    }
}
