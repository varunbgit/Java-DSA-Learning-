//package com.varun;
//https://leetcode.com/problems/maximum-depth-of-binary-tree/submissions/
//public class heightOfTree {
//    /**
//     * Definition for a binary tree node.
//     * public class TreeNode {
//     *     int val;
//     *     TreeNode left;
//     *     TreeNode right;
//     *     TreeNode() {}
//     *     TreeNode(int val) { this.val = val; }
//     *     TreeNode(int val, TreeNode left, TreeNode right) {
//     *         this.val = val;
//     *         this.left = left;
//     *         this.right = right;
//     *     }
//     * }
//     */
//    class Solution {
//        public int maxDepth(TreeNode root) {
//            if(root == null)
//                return 0;
//            return  findmax(root);
//
//        }
//        public int findmax(TreeNode root){
//            if(root==null){
//                return 0;
//            }
//            int  ans = 1 +  Math.max(findmax(root.left),findmax(root.right));
//            return ans;
//        }
//    }
//}