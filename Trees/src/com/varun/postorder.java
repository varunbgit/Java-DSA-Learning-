//package com.varun;
//
//public class postorder {
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
//        public List<Integer> postorderTraversal(TreeNode root) {
//            List ans = new ArrayList<Integer>();
//            if(root == null){
//                return ans;
//            }
//            postorder(root,ans);
//            return ans;
//        }
//        public void postorder(TreeNode root,List ans){
//            if(root!=null){
//                postorder(root.left,ans);
//                postorder(root.right,ans);
//                ans.add(root.val);
//            }
//        }
//    }
//}
