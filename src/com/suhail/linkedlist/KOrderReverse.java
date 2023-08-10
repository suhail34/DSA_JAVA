package com.suhail.linkedlist;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class KOrderReverse {
    public static void main(String[] args) {
        ListNode fifth = new ListNode(1);
        ListNode fourth = new ListNode(6,fifth);
        ListNode third = new ListNode(5,fourth);
        ListNode second = new ListNode(2,third);
        ListNode first = new ListNode(3,second);
        display(first);
        display(reverseKGroup(first,2));
//        display(first);
    }

    public static void display(ListNode head) {
        ListNode temp=head;
        while (temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("End");
    }

    public static ListNode reverseKGroup(ListNode head, int k) {

        if(k<=1 || head == null){
            return head;
        }

        ListNode temp = head;
        int length = 0;
        while(temp != null){
            temp = temp.next;
            length++;
        }

        int skip = length % k;
        int lenToIter = length - skip;
        int groups = lenToIter/k;
        ListNode prev = null;
        ListNode current = head;
        ListNode next = current.next;

        while(groups>0){
            ListNode last = prev;
            ListNode newEnd = current;
            for(int idx=0; current!=null && idx < k; idx++){
                current.next=prev;
                prev=current;
                current=next;
                if(next!=null){
                    next = next.next;
                }
            }

            if(last!=null){
                last.next = prev;
            }else {
                head = prev;
            }

            newEnd.next = current;
            prev = newEnd;

            groups--;
        }
        return head;
    }
}
