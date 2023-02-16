//package com.varun;
//
//import java.util.List;
//import java.util.Queue;
//
//public class leftViewofBtree {
//    public static void main(String[] args) {
//
//    }
//    List<Integer> ans = new ArrayList<>();
//    public List<Integer> rightSideView(TreeNode root) {
//        if(root == null){
//            return null;
//        }
//        Queue<TreeNode> q = new ArrayDeque<>();
//        q.add(root);
//
//        while(!q.isEmpty()){
//            int count= q.size();
//
//            for (int i = 0; i <count ; i++) {
//                TreeNode curr = q.remove();
//                if(i == count-1){
//                    if(curr != null){
//                        ans.add(curr.val);
//                    }
//                }
//
//                if(curr.left!= null){
//                    q.add(curr.left);
//                }
//                if(curr.right!= null){
//                    q.add(curr.right);
//                }
//            }
//        }
//        return ans;
//    }
//}
