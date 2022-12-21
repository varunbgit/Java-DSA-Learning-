package com.varun;

import java.util.ArrayDeque;

public class SizeOfBinaryTree {
   public static class Node
    {
        int key;
        Node left;
        Node right;
        Node(int k){
            key=k;
            left=right=null;
        }
    }
    public static void main(String args[])
    {

        Node root=new Node(10);
        root.left=new Node(80);
        root.right=new Node(70);
        root.left.left=new Node(30);
        root.left.right=new Node(40);
//        root.right.left=new Node(6070);

        int ans = sizeTree(root);
        System.out.println(ans);
    }

    private static int sizeTree(Node root) {
       if(root == null){
           return 0;
       }
//       ArrayDeque<Integer> queue = new ArrayDeque<>();

        int leftNodes =0 ;
        int rightNodes =0 ;
        if(root.left!= null) {
           leftNodes = sizeTree(root.left);
       }
        if(root.left!= null) {
            rightNodes = sizeTree(root.right);
        }

       return 1 + leftNodes + rightNodes;

    }

}
