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
    public void reorderList(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;

        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid=slow;
        ListNode reversedHalf=reverse(slow.next);
        slow.next=null;

        ListNode start=head;

        while(reversedHalf!=null)
        {
            ListNode temp=start.next;
            ListNode temp2=reversedHalf.next;
            start.next=reversedHalf;
            reversedHalf.next=temp;
            start=temp;
            reversedHalf=temp2;
        }


        
    }
    public ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        ListNode curr=head;
        while(curr !=null)
        {
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}
