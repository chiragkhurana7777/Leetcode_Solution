/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public ListNode rotateRight(ListNode head, int k) {
        if(head==null ||  head.next==null || k==0){
            return head;
        }

        int n=1;
        ListNode tail=head;
        while(tail.next!=null){
            n++;
            tail=tail.next;
        }
        k=k%n;
        if(k==0) return head;

        tail.next=head;

        ListNode newtail=head;
        int steps=n-k;
        for(int i=1;i<steps;i++){
            newtail=newtail.next;
        }

        ListNode newhead=newtail.next;
        newtail.next=null;

        return newhead;

    }
}