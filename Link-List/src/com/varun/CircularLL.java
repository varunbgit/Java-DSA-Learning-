package com.varun;

public class CircularLL {
    Node head;`
    Node tail;
    int size;

    public CircularLL(Node head, Node tail, int size) {
        this.head = head;
        this.tail = tail;
        this.size = size;
    }

    public CircularLL() {
        this.head = null;
        this.tail = null;
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
    public void insertAtFirst(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = node;
        }
        else{
            node.next = head;
            head = node;
        }
        size++;
    }

    public void displayList(){
        System.out.println("Start");
        while(tail.next!=head){
            System.out.println(head.value + " -> ");
        }
        System.out.println("END");
    }
}
