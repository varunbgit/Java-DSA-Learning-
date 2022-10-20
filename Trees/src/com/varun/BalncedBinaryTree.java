//package com.varun;
//
//public class BalncedBinaryTree {
//    //height of tree function is already written
//    public int maxDepth(TreeNode root) {
////            if(root == null)
////                return 0;
////            return  findmax(root);
////
////        }
////        public int findmax(TreeNode root){
////            if(root==null){
////                return 0;
////            }
////            int  ans = 1 +  Math.max(findmax(root.left),findmax(root.right));
////            return ans;
////        }
//    }
        //Approach 1
//o(n2)
//        public boolean  isBalanced(TreeNode root) {
//            if(root == null){
//                return true;
//            }
//            int lh = height(root.left);
//            int rh = height(root.right);
//
//            return Math.abs(lh-rh)<=1 && isBalanced(root.left) && isBalanced(root.right);
//        }
//
//}
