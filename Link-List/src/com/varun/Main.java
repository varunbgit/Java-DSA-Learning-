package com.varun;

public class Main {

    public static void main(String[] args) {
	// write your code here

        LinkList list = new LinkList();
        list.insertAtFirst(10);
        list.insertAtFirst(9);
        list.insertAtFirst(8);
        list.insertAtFirst(7);

        list.displayList();
        list.insertAtLast(25);
        list.displayList();
        list.insertAtPos(3,7);
        list.displayList();
        list.deletefirst();
        list.displayList();
    }
}
