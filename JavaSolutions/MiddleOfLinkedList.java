package com.learnjavafromalgomaster;



class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val=val;
    }
    public ListNode(int val,ListNode next){
        this.val=val;
        this.next=next;
    }
}

public class MiddleOfLinkedList {

    public static int getMiddle(ListNode head) {
        if(head == null) return -1;
        ListNode slow=head;
        ListNode fast=head;
        while(fast != null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.val;

    }

}