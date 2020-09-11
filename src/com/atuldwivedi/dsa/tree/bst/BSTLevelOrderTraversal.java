package com.atuldwivedi.dsa.tree.bst;

public class BSTLevelOrderTraversal {
    public void levelOrderTraversal(Node node) {

    }

    // Driver code
    class Node {
        int key;
        Node left, right;

        public Node(int key) {
            this.key = key;
        }
    }

    private Node insert(Node root, int key) {
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
}