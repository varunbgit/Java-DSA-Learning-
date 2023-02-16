package com.varun;
import java.util.*;

public class TopViewofBinaryTree {


    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
        }
    }
    static class Pair{
        int y ;
        Node node ;
        Pair(int _y ,Node _node){
            y = _y;
            node = _node;
        }
    }
    static ArrayList<Integer> topView(Node root)
    {
        // add your code
        // HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        SortedMap<Integer,Integer > map = new TreeMap<>();
        BFS(root,0,map);
        ArrayList<Integer> ls  = new ArrayList<>();
        for (Map.Entry<Integer,Integer> en :map.entrySet()){
            ls.add(en.getValue());
        }
        return ls;
//        return ls;
    }

    static void BFS(Node root, int level, SortedMap<Integer, Integer> map){
        if(root == null){
            return;
        }
        Queue <Pair> q = new ArrayDeque<>();
        q.add(new Pair(0,root));
        while(!q.isEmpty()){
            int count = q.size();

            for(int i =0 ;i<count;i++){
                Pair curr = q.poll();
                if(!map.containsKey(curr.y)){
                    map.put(curr.y, curr.node.data);
                }
                if(curr.node.left != null){
                    q.add(new Pair(curr.y -1,curr.node.left));
                }
                if(curr.node.right != null){
                    q.add(new Pair(curr.y +1,curr.node.right));
                }
            }

        }

    }

}
