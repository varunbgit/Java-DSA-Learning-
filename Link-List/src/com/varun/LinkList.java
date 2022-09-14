package com.varun;

public class LinkList {

    private Node head;
    private Node tail;
    private int size ;

    public LinkList(int size) {
        this.size = size;
    }

    public LinkList() {
        this.size = 0 ;
    }

    private class Node{
        private int value;
        private Node next;
        public Node(){}

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }


    public void insertAtFirst(int value){

        Node node = new Node(value);
        node.next=head;
        head = node;


        if(tail == null){
           tail = head ;
        }
        size++;

    }


    public void displayList(){
        Node temp ;
        temp = head;

        while(temp!= null){

            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void insertAtLast(int value){
        if(tail == null ){
            insertAtFirst(value);
        }else {
            Node node = new Node(value);
            tail.next = node;
            tail = node;
        }
        size++;
    }
    public void insertAtPos(int pos ,int value){
        Node node = new Node(value);
        if(pos == 0){
            insertAtFirst(value);

            return;
        }
        if(pos == size - 1){
            insertAtLast(value);
            return;
        }
        //Node temp = new Node();
        Node temp = new Node();
                temp = head ;
        for (int i = 0; i <pos-1 ; i++) {
            temp= temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        size++;
    }

}
