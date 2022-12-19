package com.varun;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class DesignHashSet {
    public static void main(String[] args) {
        String[] str = {"MyHashSet", "add", "add", "contains", "contains", "add", "contains", "remove", "contains"};
int []arr = {1, 2, 1, 3, 2, 2, 2, 2};
    }



    class MyHashSet {
List<Integer> list;
        public MyHashSet() {
list = new ArrayList<>();
        }

        public void add(int key) {
            if(!list.contains(key)){
                list.add(key);
            }
        }

        public void remove(int key) {
            if(list.contains(key)){
                list.remove(key);
            }
        }

        public boolean contains(int key) {
            if(list.contains(key)){
                return true;
            }
            return false;
        }
    }
}
