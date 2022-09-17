package com.varun;

public class DLL {
    Node head;
    int size =0;

    public DLL(Node head, int size) {
        this.head = head;
        this.size = size;
    }

    public class Node{
        int value;
        Node next;
        Node prev;

        public Node() {
        }

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }


        public void  insertFirst(int value){
            Node node = new Node(value);

        }
        public void display(){

        }
        public void displayRev(){

        }
    }


}
