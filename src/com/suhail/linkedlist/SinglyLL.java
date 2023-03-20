package com.suhail.linkedlist;

public class SinglyLL {

    private Node head;
    private Node tail;
    private int size;

    public SinglyLL(){
        this.size=0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;

        if(tail == null){
            tail=head;
        }

        size+=1;
    }

    public void insertLast(int val){

        if(tail == null){
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }

    public void insertAtIdx(int val, int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int idx=1; idx < index; idx++){
            temp=temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next=node;
        size++;

    }

    //insert using Recursion
    public void insertRec(int val, int index){
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node){
        if(index == 0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index-1, node.next);
        return node;
    }

    public int deleteFirst(){
        int val = head.val;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        int val = tail.val;
        Node secondLast=get(size-2);
        System.out.println(secondLast.val+"val");
        tail=secondLast;
        tail.next=null;
        size--;
        return val;
    }

    public int deleteIdx(int idx) {
        if(idx==0){
            return deleteFirst();
        }
        if(idx==size-1){
            return deleteLast();
        }

        Node prev = get(idx-1);
        int val= prev.next.val;
        prev.next=prev.next.next;
        return val;
    }

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

    public void display() {
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("End");
    }

    private class Node {
        private int val;
        private Node next;

        public Node(int val){
            this.val=val;
        }

        public Node(int val, Node next){
            this.val=val;
            this.next=next;
        }
    }

    // Questions
    public void duplicates(){
        Node node=head;

        while(node.next!=null){
            if(node.val == node.next.val){
                node.next = node.next.next;
                size--;
            }else {
                node=node.next;
            }
        }
        tail=node;
        tail.next=null;
    }

    public static SinglyLL merge(SinglyLL first, SinglyLL second){
        Node f=first.head;
        Node s= second.head;
        SinglyLL ans = new SinglyLL();

        while(f != null && s != null){
            if(f.val < s.val){
                ans.insertLast(f.val);
                f = f.next;
            }else {
                ans.insertLast(s.val);
                s = s.next;
            }
        }

        while (f != null){
            ans.insertLast(f.val);
            f=f.next;
        }

        while (s != null){
            ans.insertLast(s.val);
            s=s.next;
        }

        return ans;
    }

    public void bubbleSort(){
        bubbleSort(size-1,0);
    }

    public void bubbleSort(int row, int col){
        if(row == 0){
            return;
        }

        if(col < row){
            Node first = get(col);
            Node second = get(col+1);
            if(first.val > second.val){
                if(first == head){
                    head = second;
                    first.next=second.next;
                    second.next=first;
                }else if(second == tail){
                    Node prev = get(col-1);
                    prev.next=second;
                    tail = first;
                    first.next=null;
                    second.next=tail;
                } else {
                    Node prev = get(col-1);
                    prev.next = second;
                    first.next=second.next;
                    second.next=first;
                }
            }
            bubbleSort(row, col+1);
        }else{
            bubbleSort(row-1, 0);
        }
    }

    // Recursive method
    public void reverse(Node node){

        if(node==tail){
            head=tail;
            return ;
        }

        reverse(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;

    }

    // Iterative method
    public void reverseIter(){
        if(head==null){
            return;
        }

        Node prev=null;
        Node present = head;
        Node next = present.next;

        while(present!=null){
            present.next=prev;
            prev=present;
            present=next;
            if(next!=null){
                next=next.next;
            }
        }
        head=prev;
    }

    public Node middleNode(Node head){
        Node f=head;
        Node s = head;

        while(f!=null && s!=null){
            f = f.next.next;
            s = s.next;
        }

        return s;
    }

    public static void main(String[] args) {
//        SinglyLL list = new SinglyLL();
//        list.insertLast(1);
//        list.insertLast(1);
//        list.insertLast(1);
//        list.insertLast(2);
//        list.insertLast(2);
//        list.insertLast(4);
//        list.insertLast(4);
//
//        list.duplicates();
//        list.display();
//        SinglyLL list1 = new SinglyLL();
//        SinglyLL list2 = new SinglyLL();
//
//        list1.insertLast(1);
//        list1.insertLast(3);
//        list1.insertLast(5);
//
//        list2.insertLast(1);
//        list2.insertLast(2);
//        list2.insertLast(4);
//        list2.insertLast(9);
//
//        SinglyLL l1l2=SinglyLL.merge(list1,list2);
//        l1l2.display();
        SinglyLL list = new SinglyLL();

        for(int i=7; i>0; i--){
            list.insertLast(i);
        }
        list.display();
        list.bubbleSort();
        list.display();
        list.reverse(list.head);
        list.display();
        list.reverseIter();
        list.display();
    }

}
