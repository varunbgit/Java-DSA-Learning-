package com.varun;

public class DLL {
    private Node head;
    private int size =0;

    public DLL() {
    }

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

    }

    public void  insertFirst(int value){
        Node node = new Node(value);
        //if first node in list
        if(head == null){
            node.next = null;
            node.prev = null;
            head = node;

        }
        else {
            // if this is not first node;
            head.prev = node;
            node.next = head;
            node.prev = null;
            head = node;
        }
        size++;

    }
    Node last = null;

    public void display(){
        Node temp = new Node();
        temp = head;

        while(temp != null){
            System.out.print(temp.value + "->");
            last = temp;
            temp = temp.next;

        }
        System.out.println("END");

    }
    public void displayRev(){
        Node temp = new Node();
        temp = last;
        while(temp != null){
            System.out.print(temp.value + " ->");
            temp = temp.prev;

        }
        System.out.println("START");
    }

    public void insertLast(int value){
        Node node = new Node(value);
        Node last = head;
        while(last.next != null){
            last= last.next;
        }
        node.next = null;
        last.next = node;
        node.prev = node;
        size ++;
    }
}
