package com.atuldwivedi.dsa.tree.bst;

public class BSTDataStructure {
    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            this.key = item;
            this.left = this.right = null;
        }
    }

    public Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }

        if (key < root.key) {
            root.left = insert(root.left, key);
        } else {
            root.right = insert(root.right, key);
        }
        return root;
    }

    /**
     * In order traversal of binary search tree.
     * 
     * Result will be sorted keys in ascending order.
     * 
     * Analysis: Time complexity - O(n) Space Complexity - O(1)
     */
    public void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        inOrderTraversal(root.left);
        System.out.print(root.key + " ");
        inOrderTraversal(root.right);
    }

    public void preOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.key + " ");
        inOrderTraversal(root.left);
        inOrderTraversal(root.right);
    }

    public void postOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        inOrderTraversal(root.left);
        inOrderTraversal(root.right);
        System.out.print(root.key + " ");
    }

    public static void main(String[] args) {
        BSTDataStructure bst = new BSTDataStructure();
        Node root = bst.insert(null, 1);
        bst.insert(root, 2);
        bst.insert(root, 3);
        bst.insert(root, 4);
        bst.insert(root, 5);

        bst.inOrderTraversal(root);
        bst.preOrderTraversal(root);
        bst.postOrderTraversal(root);
    }
}