//package com.varun;

//https://leetcode.com/problems/same-tree/description/

//public class SameTreeLC {
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
//        public boolean isSameTree(TreeNode p, TreeNode q) {
//
//            //  String str1 = "";
//            //  String str2 = "";
//            // str1 = inorderTraversal(p,str1);
//            // str2 = inorderTraversal(q,str2);
//            // System.out.println(str1 + "  " + str2);
//            // if(str1.equals(str2)){
//            //     return true;
//            // }
//            // return false;
//            if((p==null && q!=null) || (p!=null && q==null)){
//                return false;
//            }
//            if(p==null && q == null){
//                return true;
//            }
//            if(p.left!=null && q.left== null || p.left==null && q.left!= null){
//                return false;
//            }
//            if((p.left!= null &&q.left!= null)&&  (p.left.val != q.left.val)){
//                return false;
//            }
//            if((p.right!= null &&q.right!= null)&& (p.right.val  != q.right.val)){
//                return false;
//            }
//
//            return (p.val== q.val) && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
//
//        }
//
//        // public String inorderTraversal(TreeNode p, String str) {
//        //     if(p==null){
//        //         return "/";
//        //     }
//        //     str += p.val;
//        //     str+=inorderTraversal(p.left,str);
//        //     str+=inorderTraversal(p.right,str);
//        //     return str;
//
//        // }
//
//
//    }
//}
