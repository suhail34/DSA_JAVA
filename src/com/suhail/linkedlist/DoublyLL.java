package com.suhail.linkedlist;

public class DoublyLL {

    private Node head;
    int size;

    public DoublyLL() {
        this.size=0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
        size++;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;

        node.next=null;

        if(head==null){
            node.prev=null;
            head=node;
            return;
        }

        while (last.next!=null){
            last=last.next;
        }
        last.next=node;
        node.prev=last;
        size++;
    }

    public void insert(int after, int val){
        Node prevNode = findNode(after);
        if(prevNode==null){
            System.out.println("Node does not exit");
            return;
        }

        Node node = new Node(val);
        node.next=prevNode.next;
        prevNode.next=node;
        node.prev=prevNode;
        if(node.next!=null) {
            node.next.prev = node;
        }
        size++;
    }

    public int deleteFirst(){
        int val = head.val;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }

    public int deleteLast(){
        Node secondLast=get(size-2);
        int val=secondLast.next.val;
        secondLast.next=null;
        size--;
        return val;
    }

    public int delete(int val){
        Node node = findNode(val);
        int value = node.val;
        node.prev.next=node.next;
        node.next.prev=node.prev;
        size--;
        return value;
    }

//    public void insertLast(int val){
//        Node node=new Node(val);
//        Node secondLast = get(size-1);
//        secondLast.next=node;
//        node.prev=secondLast;
//        node.next=null;
//        size++;
//    }

    public Node findNode(int value) {
        Node node = head;
        while (node != null) {
            if(node.val==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }

    public Node get(int index){
        Node node = head;

        for (int idx=0; idx < index; idx++){
            node=node.next;
        }

        return node;
    }

    public void display(){
        Node temp=head;
        Node last=null;
        while (temp!=null){
            System.out.print(temp.val+"->");
            last=temp;
            temp=temp.next;
        }
        System.out.println("End");

        System.out.println("Print in Reverse");
        while (last!=null){
            System.out.print(last.val+"->");
            last=last.prev;
        }
        System.out.println("Start");
    }

    private class Node{
        int val;
        Node prev;
        Node next;


        public Node(int val) {
            this.val=val;
        }

        public Node(int val, Node prev, Node next) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
    }
}
