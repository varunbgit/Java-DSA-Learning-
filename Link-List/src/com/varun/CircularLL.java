package com.varun;

public class CircularLL {
    Node head;
    Node tail;
    int size;

    public CircularLL(int size) {
        this.size = size;
    }

    private class Node{
        private int value;
        private Node next;

        public Node() {
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value) {
            this.value = value;
        }
    }

}
