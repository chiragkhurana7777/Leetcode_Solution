
//   Definition for singly-linked list.
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode current=head; //current to mark our location
        int carry=0;
        int sum=0;
        int digit=0;
        while(l1!=null || l2!=null || carry!=0){
            int x=(l1!=null)?l1.val:0;
            int y=(l2!=null)?l2.val:0;
            sum=x + y+carry;
            digit=sum%10;
            carry = sum/10;

            ListNode temp= new ListNode(digit); // temp that stores new node a
            current.next=temp;//adding new node to your list
            current=temp;//forwarding our current to the next node;

            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }
        return head.next; //head.next not only head because head has a dummy node 0 which we made just to initialize the new list and it's not the part of our answer
    }
}