class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode detectCycle(ListNode head) {

        /*The entire idea in one sentence : Floyd's Cycle Detection
        
        First use slow/fast pointers to meet somewhere inside the cycle, then put one pointer at the head and move both equally until they meet at the cycle's starting node. */

        ListNode slow=head;
        ListNode fast=head;

        boolean flag=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                flag=true;
                break;
            }
        }

        if(!flag) return null;

        slow=head;

        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }

        return slow;

    }
}