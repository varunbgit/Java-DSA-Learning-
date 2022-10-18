package com.varun;

public class LeftViewOfTREE {
    //Approach 1
    //iterative approach
//    if we do BFS we always visit the left node first

    public void leftView(TreeNode root){
        if(root == null){
            return;
        }
        System.out.println(root.val);
        leftView(root.left);
    }
}

