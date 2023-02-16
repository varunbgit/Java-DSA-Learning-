package com.varun;

import com.sun.source.tree.Tree;

import java.util.*;

public class VerticalOrderTraversalofTree {

    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }
    public static void main(String[] args) {
//        TreeNode root=new TreeNode(1);
//        root.left= new TreeNode(2);
//        root.right=new TreeNode(3);
//        root.left.left=new TreeNode(4);
//        root.left.right=new TreeNode(6);
//        root.right.left=new TreeNode(5);
//        root.right.right=new TreeNode(7);
        TreeNode root=new TreeNode(3);
        root.left= new TreeNode(1);
        root.right=new TreeNode(4);
        root.left.left=new TreeNode(0);
        root.left.right=new TreeNode(2);
        root.right.left=new TreeNode(2);
//        root.right.right=new TreeNode(null);
        List<List<Integer>> ans  = verticalTraversal(root);
        System.out.println("In psvm");
        for(List<Integer> ls : ans){
            System.out.println(ls.toString());
        }


    }
    public static class Pair{
        TreeNode node;
        int y;
        Pair(int y,TreeNode node){
            this.y = y;
            this.node  = node;
        }
    }
    public static class Pair2{

        int y;
        int val;
        Pair2(int y,int val){
            this.y = y;
            this.val  = val;
        }
    }

    public static List<List<Integer>> verticalTraversal(TreeNode root) {
        SortedMap<Integer,ArrayList <Integer>> map = new TreeMap<>();
        List<List<Integer>> ans =  new ArrayList<>();

        Queue<Pair> q= new ArrayDeque<>();
        q.add(new Pair(0,root));

        while(!q.isEmpty()){
            int count = q.size();
            ArrayList<Pair2> al = new ArrayList<>();
            for (int i = 0; i <count; i++) {
                Pair curr  =  q.remove();
                if(curr.node.left != null) {
                    q.add(new Pair(curr.y -1,curr.node.left));
                }
                if(curr.node.right != null) {
                    q.add(new Pair(curr.y + 1,curr.node.right));
                }



                al.add(new Pair2(curr.y,curr.node.val));


            }
            al.sort(new Comparator<Pair2>() {
                @Override
                public int compare(Pair2 o1, Pair2 o2) {
                        if(o1.val >= o2.val){
                            return 1;
                        }
                        return -1;

//                    return 0;
                }
            });



            for(Pair2 p : al){
                if(map.get(p.y) == null){
                    map.put(p.y,new ArrayList<>());

                }
                map.get(p.y).add(p.val);

            }

            System.out.println(map);


        }


        for (Map.Entry<Integer,ArrayList<Integer>> en :map.entrySet()){
            ans.add(en.getValue());
        }
        return ans;
    }

}
