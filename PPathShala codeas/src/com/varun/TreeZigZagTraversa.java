//package com.varun;
//
//import java.util.ArrayList;
//import java.util.*;
//import java.util.Queue;
//
//
////  Definition for a binary tree node.
////  public class TreeNode {
//      int val;
//      TreeNode left;
//      TreeNode right;
//      TreeNode() {}
//      TreeNode(int val) { this.val = val; }
//      TreeNode(int val, TreeNode left, TreeNode right) {
//          this.val = val;
//          this.left = left;
//          this.right = right;
//      }
//  }
//
//
//public class TreeZigZagTraversa {
//    List<List<Integer>> ans = new ArrayList<>();
//    boolean right = true;
//    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//        // line by line traversal on the tree
//        BFS(root);
//        return ans;
//    }
//
//    public void BFS(TreeNode root){
//        if(root == null){
//            return;
//        }
//        Queue<TreeNode> q = new ArrayDeque<>();
//        q.add(root);
//
//        while(!q.isEmpty()){
//            int count= q.size();
//
//            for (int i = 0; i <count; i++) {
//                TreeNode curr = q.poll();
//                if(right){
//                    Stack<TreeNode> st = new Stack<>();
//                    if(curr.right!= null){
//                        st.push(curr.right);
//                    }
//                    if(curr.left!= null){
//                        st.push(curr.left);
//                    }
//                }else{
//
//                }
//            }
//
//        }
//
//
//
//    }
//}
