//package com.varun;
//
//public class LowestCommonAncestorofaBinaryTree {
//    lass Solution {
//        // boolean found = false;
//        ArrayList<TreeNode> ap = new ArrayList<>();
//        ArrayList<TreeNode> aq = new ArrayList<>();
//        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//            find(root,p.val,ap,false);
//            find(root,q.val,aq,false);
//            ap.add(root);
//            aq.add(root);
//            for(TreeNode t : ap){
//                System.out.print(t.val  + " ");
//            }
//            System.out.println();
//            for(TreeNode t : aq){
//                System.out.print(t.val  + " ");
//            }
//            System.out.println();
//            // int ip = 0;
//            // int iq = 0;
//            int i = 0;
//            TreeNode ans = null;
//            while(i < ap.size() && i < aq.size() ){
//                if(ap.get(i).val == aq.get(i).val){
//                    ans = ap.get(i);
//                }
//                i++;
//            }
//
//            return ans;
//        }
//
//        public void find(TreeNode root, int val,ArrayList<TreeNode> l,boolean found){
//            if(root == null){
//                return;
//            }
//            if(root.val == val){
//                l.add(root);
//                found = true;
//                return;
//            }
//            find(root.left,val,l,found);
//            if(found == true){
//                l.add(root);
//                return;
//            }else{
//                find(root.right,val,l,found);
//                if(found == true){
//                    l.add(root);
//                }
//            }
//        }
//    }
//}
