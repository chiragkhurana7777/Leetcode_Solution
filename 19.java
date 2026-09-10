class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        
        int size=0;
        ListNode current=head;
        while(current!=null){
            size++;
            current=current.next;
        }
        int target=size-n;
        if(target==0){
            return head.next;
        }

        int count=0;

        ListNode prev=null;
        current=head;
        while(count!=target){
            count++;
            prev=current;
            current=current.next;
        }
        prev.next=current.next;
        return head;

    }
}

class Solution1 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummy = new ListNode(0,head);

        ListNode slow=dummy;
        ListNode fast=dummy;

        for(int i=0;i<=n;i++){
            fast=fast.next;
        }

        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return dummy.next;

        
    }
}