//package com.varun;
//https://leetcode.com/problems/binary-tree-preorder-traversal/submissions/
//public class preorder {
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
//        public List<Integer> preorderTraversal(TreeNode root) {
//            List ans = new ArrayList<Integer>();
//
//            if(root == null){
//                return ans;
//            }
//
//            preorder(root,ans);
//            return ans;
//        }
//
//        public void preorder(TreeNode root,List ans){
//            if(root!=null){
//                ans.add(root.val);
//                preorder(root.left,ans);
//                preorder(root.right,ans);
//
//            }
//
//
//            return;
//
//
//
//        }
//
//    }
//}
