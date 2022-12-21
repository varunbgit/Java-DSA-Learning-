package com.varun;

public class BalancedTree {
    static class Node {
        int key;
        Node left;
        Node right;

        Node(int k) {
            key = k;
            left = right = null;
        }
    }


    public static void main(String args[]) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(30);
        root.right.left = new Node(15);
        root.right.right = new Node(20);

        System.out.println(isBalanced(root));
    }

    private static boolean isBalanced(Node root) {
       if(root == null){
           return true;
       }
        int leftHeight = heighttree(root.left);
        int rightHeight  = heighttree(root.left);

        return Math.abs(leftHeight-rightHeight)<=1 && isBalanced(root.left) && isBalanced(root.right);
    }
    public static int heighttree(Node root){
        if(root == null){
            return  0;
        }
        return 1 + heighttree(root.left) + heighttree(root.right);
    }

}