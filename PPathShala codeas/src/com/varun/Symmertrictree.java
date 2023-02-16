package com.varun;


public class Symmertrictree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = null;
        root.left.left.right = new TreeNode(4);
        boolean ans = isSymmetric(root);
        System.out.println(ans);
    }

    public static boolean isSymmetric(TreeNode root) {

        return check(root.left,root.right);

    }
    public static boolean check(TreeNode r1,TreeNode r2){
        if(r1== null && r2 == null){
            return true;
        }
        if((r1!= null && r2 == null) || (r1 == null && r2 != null)){
            return false;
        }
        if(r1.val != r2.val){
            return false;
        }
        return check(r1.left,r2.right) && check(r2.right,r1.left);
    }
}
