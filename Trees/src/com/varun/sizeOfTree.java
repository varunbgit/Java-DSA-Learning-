//package com.varun;
//
//public class sizeOfTree {
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
//        public int countNodes(TreeNode root) {
//            if(root == null){
//                return 0;
//            }
//            int ans = 0;
//            ans = countNodes(root.left) +countNodes(root.right) + 1;
//
//            return ans;
//
//        }
//    }
//
//}
