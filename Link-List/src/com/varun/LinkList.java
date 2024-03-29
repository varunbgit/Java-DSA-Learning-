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
        // Approach 2
//        Node nodee = new node(value,temp.next)//we already have a constructor that attaches the node.next
        // to the passed next nodee value;
        node.next = temp.next;
        temp.next = node;
        size++;
    }
    public Node get(int index){
        Node node = new Node();
        node =head;
        for (int i = 0; i <= index-1; i++) {
            node = node.next;
        }
        return node;
    }
    //deletion starts heree

    public int deletefirst(){
        int value = head.value;;
        head = head.next;
        size--;
        return value;

    }
    public int deletelast(){
        int value = tail.value;
        Node prev = get(size-2);
        tail=prev;
       tail.next = null;
        size--;
        return value;
    }

    public int deletePos(int index){
        if(index==1){
            return deletefirst();
        }
        if(index == size -1){
            return deletelast();
        }
        Node node = get(index-1);
        int value = node.next.value;
        node.next = node.next.next;
        size--;
        return value;
    }
    public void insertRec(int v,int index){
        head = insertRec(v,index,head);
    }
    private Node insertRec(int value,int  index,Node node){
        if(index == 0){
            Node temp  = new Node(value);
            temp.next = node;
            return temp;
    }

        node.next = insertRec(value,index-1,node.next);
        return  node;
    }


}
