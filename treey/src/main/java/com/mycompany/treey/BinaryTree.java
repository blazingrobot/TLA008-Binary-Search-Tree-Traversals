package com.mycompany.treey;

public class BinaryTree {
    Node root;
    
    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.value) {
            root.left = insertRec(root.left, value); 
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }
    public void inorder (){inorderRec(root);}
    
    public static void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.value);
            inorderRec(root.right);
        } 
    }
     
    public static void preorder(Node root) {
        if (root != null) {
            System.out.print(root.value);
            preorder(root.left);
            preorder(root.right);
        }
    }
    
    public static void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.value);
        }
    }
}
