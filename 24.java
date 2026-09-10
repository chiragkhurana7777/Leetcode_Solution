class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;

        ListNode dummy = new ListNode(0,head);

        ListNode current=head;
        ListNode prev=dummy;

        while(current!=null && current.next!=null){
            ListNode temp = current.next;
            current.next=current.next.next;
            temp.next=current;
            prev.next=temp;
            prev=current;
            current=current.next;
        }     
        return dummy.next;
    }
}