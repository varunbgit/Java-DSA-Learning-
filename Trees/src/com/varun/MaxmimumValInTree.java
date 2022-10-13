package com.varun;

public class MaxmimumValInTree {
    int max = 0;
    Maxval(root,max);
    public int MaxVal(TreeNode root,int max){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        max = Math.max(root.max,Math.max(MaxVal(root.left),MaxVal(root.right)));
        return ans;
    }
}
