class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        
        //middle:
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        //reverse:
        ListNode prev=null;
        ListNode current=slow;
        while(current!=null){
            ListNode next = current.next;
            current.next=prev;
            prev=current;
            current=next;
        }

        //compare:
        ListNode left=head;
        ListNode right=prev;

        while(right!=null){
            if(left.val!=right.val) return false;

            left=left.next;
            right=right.next;
        }

        return true;

    }
}