package com.varun;

public class ChildSumProperty {
    static class Node {
        int key;
        Node left;
        Node right;

        Node(int k) {
            key = k;
            left = right = null;
        }
    }
    public static void main(String args[])
    {
        Node root=new Node(20);
        root.left=new Node(8);
        root.right=new Node(12);
        root.right.left=new Node(3);
        root.right.right=new Node(9);

        System.out.print(ChildSum(root));
    }
    private static boolean ChildSum(Node root) {
//        if(root == null || root.left == null && root.right==null){
//            return true;
//        }
//        int sum = 0;
//        if(root.left != null && root.right == null){
//            sum = root.left.key;
//        }
//        if(root.left == null && root.right != null){
//            sum = root.right.key;
//        }
//        else{
//            sum  = root.left.key + root.right.key;
//        }
//        return (sum==root.key) && ChildSum(root.left) && ChildSum(root.right);

        //this code is good
//        More neat code would be
        if(root == null || root.left == null && root.right==null){
            return true;
        }
        int sum = 0;
        if(root.left!=null)
            sum += root.left.key;
        if(root.right!=null){
            sum+=root.right.key;
        }
        return (sum==root.key) && ChildSum(root.left) && ChildSum(root.right);
    }

}
