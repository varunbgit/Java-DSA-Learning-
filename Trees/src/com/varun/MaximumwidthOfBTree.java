package com.varun;

import java.util.ArrayDeque;

public class MaximumwidthOfBTree {
    static  class Node
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
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.left=new Node(60);

        System.out.print(maxWidth(root));
    }
    public static int maxWidth(Node root){
        if(root == null)
            return 0;

        int maxW = 0;
        ArrayDeque<Node> queue = new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()){
            maxW = Math.max(queue.size(),maxW);
            int count = queue.size() ;
            for (int i = 0; i <count ; i++) {
                Node curr = queue.remove();
                if(curr.left!=null)
                    queue.add(curr.left);
                if(curr.right!=null)
                    queue.add(curr.right);
            }
        }
        return maxW;
    }
}
