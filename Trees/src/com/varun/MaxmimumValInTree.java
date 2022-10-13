package com.varun;

public class MaxmimumValInTree {
    int max = 0;
    Maxval(root,max);
    public MaxVal(TreeNode root,int max){

        max = Math.max(root.max,Math.max(MaxVal(root.left),MaxVal(root.right)));
        return ans;
    }
}
