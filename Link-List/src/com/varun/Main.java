package com.varun;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        LinkList list = new LinkList();
//        list.insertAtFirst(13);
//        list.insertAtFirst(12);
//        list.insertAtFirst(11);
//        list.insertAtFirst(10);
//        list.insertAtFirst(9);
//        list.insertAtFirst(8);
//        list.insertAtFirst(7);

//        list.displayList();
//        list.insertAtLast(25);
//        list.displayList();
//        list.insertAtPos(3,7);
//        list.displayList();
//        list.deletefirst();
//        list.displayList();
////        System.out.println(list.deletelast());
////        list.displayList();
//        System.out.println(list.deletePos(3));
//        list.displayList();




        // DLL

//        DLL Dlist = new DLL();
//        Dlist.insertFirst(13);
//        Dlist.insertFirst(12);
//        Dlist.insertFirst(11);
//        Dlist.insertFirst(10);
//        Dlist.insertFirst(9);
//        Dlist.display();
//        System.out.println("");
//        Dlist.displayRev();
//        Dlist.insertLast(14);
//        Dlist.display();
//        Dlist.insertPos(3,7);
//        Dlist.display();

//        CircularLL cList = new CircularLL();
//        cList.insertAtLast(20);
//        cList.insertAtFirst(11);
//        cList.insertAtFirst(12);
//        cList.insertAtFirst(13);
//      //  cList.displayList();
////        cList.insertAtLast(10);
////        cList.insertAtLast(15);
////        cList.insertAtLast(30);
//        cList.displayList();
//        cList.deleteFirst();
//        cList.displayList();
//        cList.deleteLast();
//        cList.displayList();

        //Insertion using Recursion in Linked lIst

        LinkList list = new LinkList();
        list.insertAtFirst(13);
        list.insertAtFirst(12);
        list.insertAtFirst(11);
        list.insertAtFirst(10);
        list.insertAtFirst(9);
        list.insertAtFirst(8);
        list.insertAtFirst(7);
        list.displayList();
        list.insertRec(4,3);

        list.displayList();

    }
}
