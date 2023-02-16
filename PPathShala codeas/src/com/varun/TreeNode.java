package com.varun;

import java.util.*;

public class TreeNode
{
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

//        List<Integer> ans =
                levelorder(root);
//        System.out.println(ans.toString());
    }

    private static void levelorder(Node root) {
        if(root == null){
            return ;
        }
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()){
            int count= q.size();
            for (int i = 0; i < count; i++) {
                Node curr = q.remove();
                if(curr!= null){
                    System.out.print(curr.key + " ") ;
                }
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            System.out.println();
        }

    }
}
