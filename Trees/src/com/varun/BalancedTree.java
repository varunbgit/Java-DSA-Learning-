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

//        System.out.println(isBalanced(root));
        int ans = isBalanced1(root);
        if(ans >0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

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

    //optimized approach
    private static int  isBalanced1(Node root) {
        //return -1 if tree not balanced
        //return +ve val if tree is balanced
        // this +ve value is its height

        if(root == null){
            return 0;
        }
        int lh = isBalanced1(root.left);
        if(lh == -1){
            return -1;
        }
        int rh = isBalanced1(root.right);
        if(rh == -1){
            return -1;
        }
        if(Math.abs(lh-rh)>1){
            return -1;
        }
        else{
            return 1 + Math.max(lh,rh);
        }
    }
}