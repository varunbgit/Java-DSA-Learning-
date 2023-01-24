package com.varun;

import java.util.ArrayDeque;
import java.util.Stack;

public class PrintInSpiralFormat {
    static class Node
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
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        printSpiral(root);
    }

    private static void printSpiral(Node root) {
        if(root == null){
            return ;
        }
        ArrayDeque<Node> queue = new ArrayDeque<>();
//     ****** Do a simple BFS if reverse is true at last
//     just reverse the list and then add it to ans  ******
        boolean reverse = false;
        Stack<Integer> stack = new Stack<>();
        queue.add(root);
        while (queue.isEmpty() == false){
            int count = queue.size();
            for (int i = 0; i <count ; i++) {
                Node curr = queue.poll();
                if (reverse) {
                    stack.push(curr.key);
                } else {
                    System.out.print(curr.key + " ");
                }

                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
            if(reverse){
                //stack must have some values
                while(stack.isEmpty() == false){
                    System.out.print(stack.pop() + " ");
                }
            }
            System.out.println();
            reverse = !reverse;

        }

    }
}
