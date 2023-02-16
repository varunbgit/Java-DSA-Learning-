package com.varun;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
public class BFSofbinaryTree {
    static ArrayList<Integer> levelOrder(Node root){
        if(root == null){
            return null;
        }
        ArrayList<Integer> ar = new ArrayList<>();
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()){
            Node node =q.peek();
            q.remove();
            if(node!= null){
                ar.add(node.data);
                q.add(node.left);
                q.add(node.right);
            }

        }
        return ar;

    }
}
