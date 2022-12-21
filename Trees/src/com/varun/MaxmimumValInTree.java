package com.varun;

public class MaxmimumValInTree {
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
            Node root=new Node(200);
            root.left=new Node(80);
            root.right=new Node(30);
            root.right.left=new Node(40);
            root.right.right=new Node(50);

            System.out.print(getMax(root));
        }

    private static int getMax(Node root) {
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int maxVal = root.key;
        maxVal=Math.max(maxVal,Math.max(root.left.key,root.right.key));
        return maxVal;
    }


}
