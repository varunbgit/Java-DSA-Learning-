//package com.varun;
//https://leetcode.com/problems/binary-tree-inorder-traversal/
//public class Main {
//
//    public static void main(String[] args) {
//	// write your code here
//        /**
//         * Definition for a binary tree node.
//         * public class TreeNode {
//         *     int val;
//         *     TreeNode left;
//         *     TreeNode right;
//         *     TreeNode() {}
//         *     TreeNode(int val) { this.val = val; }
//         *     TreeNode(int val, TreeNode left, TreeNode right) {
//         *         this.val = val;
//         *         this.left = left;
//         *         this.right = right;
//         *     }
//         * }
//         */
//        class Solution {
//            public List<Integer> inorderTraversal(TreeNode root) {
//
//                List <Integer> ans = new ArrayList();
//                if(root==null){
//                    return ans;
//                }
//
//                inorder(root,ans);
//                return ans;
//
//
//
//            }
//            public void inorder(TreeNode root, List<Integer> ans){
//                if(root == null){
//                    return;
//                }else{
//                    inorder(root.left,ans);
//                    ans.add(root.val);
//                    inorder(root.right,ans);
//                }
//
//
//            }
//        }
//    }
//}
