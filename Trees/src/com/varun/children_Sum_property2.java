//package com.varun;
//https://practice.geeksforgeeks.org/problems/children-sum-parent/1
// gfg problem
//public class children_Sum_property2 {
//    class Tree
//    {
//        //Function to check whether all nodes of a tree have the value
//        //equal to the sum of their child nodes.
//        public static int isSumProperty(Node root)
//        {
//            // add your code here
//            if(root == null){
//                return 1;
//            }
//            if(root.left == null && root.right == null){
//                return 1;
//            }
//
//            int sum = 0;
//            if(root.left!=null){
//                sum += root.left.data;
//            }
//            if(root.right!=null){
//                sum += root.right.data;
//            }
//
//
//            if (sum==root.data && isSumProperty(root.left)==1 &&  isSumProperty(root.right)==1){
//                return 1;
//            }else{
//                return 0;
//            }
//        }
//    }
//}
