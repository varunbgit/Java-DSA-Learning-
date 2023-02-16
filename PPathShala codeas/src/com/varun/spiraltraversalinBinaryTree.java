//package com.varun;
//import  java.util.*;
//public class spiraltraversalinBinaryTree {
//    public static ArrayList<Integer> findSpiral(Node root)
//    {
//        // Your code here
//
//        ArrayList<Integer> findSpiral(Node root)
//        {
//            ArrayList<Integer> ans = new ArrayList<>();
//            if (root == null) {
//                return ans;
//            }
//            boolean right = true;
//            Queue<Node> q = new ArrayDeque<>();
//            q.add(root);
//
//            while (!q.isEmpty()) {
//                Node curr = q.peek();
//                ans.add(curr.data);
//                Queue<Node> tq = new ArrayDeque<>();
//                while (q.size() > 0) {
//                    if(curr.left!=null){tq.add(curr.left);}
//                    if(curr.right!=null){tq.add(curr.right);}
//                    q.remove();
//                }
//                if (right) {
//                    right = !right;
//                    int size = tq.size();
//                    Collections.reverse((List<?>) tq);
//
//                }
//                q = tq;
//            }
//            return ans;
//
//        }
//}
