package com.varun;

public class CircularLL {
    Node head;
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
        size++;
        if(head == null){
            head = node;
            tail = node;
            node.next = head;
        }
        else{
            tail.next = node;
            node.next = head;
            head = node;
        }

    }

    public void insertAtLast(int value){
        Node node  = new Node(value);
        size++;
        if(head == null){
            head = node;
            tail = node;
            head.next = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail =node;

    }

    public void displayList(){
        Node temp = head;
        System.out.println("Start");
        if(head!=null) {
            do {
                System.out.print(temp.value + "->");
                temp = temp.next;
            }
            while(temp!=head);

            }
            System.out.println("END");
        }
    }
