//package com.varun;
//
//import java.util.HashMap;
//
//public class Node {
//    int val;
//    Node next;
//    Node prev;
//
//    // public Node(){};
//    public Node(int val) {
//        this.val = val;
//    }
//
//    public class LRU {
//
//        int size;
//        int cap;
//        HashMap<Integer, Node> map;
//        Node head;
//        Node tail;
//
//        public LRU(int capacity) {
//            cap = capacity;
//            size = 0;
//            map = new HashMap<>(capacity);
//
//            head = new Node(-1);
//            tail = new Node(-1);
//            head.prev = null;
//            tail.next = null;
//            tail.prev = head;
//            head.next = tail;
//        }
//
//        public int get(int key) {
//            System.out.println("Map is" + map);
//            if (size == 0) {
//                return -1;
//            }
//            if (map.containsKey(key)) {
//                int ans = map.get(key).val;
//                Node itr = map.get(key);
//                //we need to put this node to prev of tail
//                itr.prev.next = itr.next;
//                itr.next.prev = itr.prev;
//                itr.next = tail;
//                itr.prev = tail.prev;
//                itr.prev.next = itr;
//                tail.prev = itr;
//                return ans;
//            } else {
//                return -1;
//            }
//        }
//
//        public void put(int key, int value) {
//            if (size == cap) {
//                System.out.println("Size is full Map is" + map);
//                map.remove(key);
//                head.next = head.next.next;
//                head.next.prev = head;
//                size--;
//
//            }
//            Node node = new Node(value);
//            node.next = tail;
//            node.prev = tail.prev;
//            tail.prev.next = node;
//            tail.prev = node;
//            map.put(key, node);
//            size++;
//            System.out.println("Size is " + size + " Map after put is" + map);
//
//        }
//    }
//}
