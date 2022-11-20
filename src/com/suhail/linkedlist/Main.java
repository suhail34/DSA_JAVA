package com.suhail.linkedlist;

public class Main {
    public static void main(String[] args) {
        SinglyLL list = new SinglyLL();
        list.insertFirst(2);
        list.insertFirst(4);
        list.insertFirst(6);
        list.insertFirst(8);
        list.insertFirst(9);
        list.insertFirst(10);
        list.insertLast(5);
        list.insertAtIdx(1,2);
        list.insertRec(8,2);

        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.deleteIdx(2));
        list.display();
        System.out.println(list.findNode(7));

//        DoublyLL list = new DoublyLL();
//        list.insertFirst(1);
//        list.insertFirst(2);
//        list.insertFirst(3);
//        list.insertFirst(4);
//        list.insertFirst(5);
//        list.insertLast(6);
//        list.insert(1,0);
//
//        list.display();
//        System.out.println("Size of Linked List "+list.size);
//        System.out.println();
//
//        System.out.println("Deleted item from first "+list.deleteFirst());
//        list.display();
//        System.out.println("Size of Linked List "+list.size);
//        System.out.println();
//
//        System.out.println("Deleted item from Last "+list.deleteLast());
//        list.display();
//        System.out.println("Size of Linked List "+list.size);
//        System.out.println();
//
//        System.out.println("Deleted item from between "+list.delete(2));
//        list.display();
//        System.out.println("Size of Linked List "+list.size);

//        CircularLL list = new CircularLL();
//
//        list.insertFirst(1);
//        list.insertFirst(2);
//        list.insertFirst(3);
//        list.insertFirst(4);
//        list.insertFirst(5);
//
//        list.display();
//        System.out.println("Size Of Linked List "+list.size);
//
//        list.delete(3);
//        list.display();
    }
}
