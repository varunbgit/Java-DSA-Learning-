package com.varun;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class LevelOrderTraversal {
    public  class Node
    {
        int data;
        Node left, right;

        Node(int item)
        {
            data = item;
            left = right = null;
        }
    }


    public static ArrayList<Integer> levelOrder(Node node)
    {
        // Your code here

        if(node == null){
            return null;
        }
        ArrayDeque<Node> queue = new ArrayDeque<>();
        ArrayList<Integer> list = new ArrayList<>();

        queue.add(node);

        while(queue.isEmpty() == false){
            Node curr  = queue.poll();
            list.add(curr.data);
            if(curr.left!= null){
                queue.add(curr.left);
            }
            if(curr.right!= null){
                queue.add(curr.right);
            }
        }

        return list;
    }


}
