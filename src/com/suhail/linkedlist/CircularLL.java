package com.suhail.linkedlist;

public class CircularLL {

    private Node head;
    private Node tail;
    int size;

    public CircularLL() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        if(head==null){
            head=node;
            tail=node;
            size++;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
        size++;
    }

    public void delete(int val){
        Node node=head;
        if(node.val==val){
            head=node.next;
            tail.next=head;
            return;
        }

        do{
            Node deleteN = node.next;
            if(deleteN.val==val){
                node.next=deleteN.next;
                break;
            }
            node=node.next;
        }while (node!= head);
    }

    public void display(){
        Node temp = head;
        if(head!=null){
            do{
                System.out.print(temp.val+"->");
                temp=temp.next;
            }while (temp!=head);
            System.out.println("HEAD");
        }
    }

    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
