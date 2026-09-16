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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode node= head;
        int count=0;
        while(node !=null && count<k)
        {
            node=node.next;
            count++;
        }
        if(count<k) return head;

        ListNode secondHalf =head;
        for(int i=1;i<k;i++)
        {
            secondHalf=secondHalf.next;
        }
        ListNode second= secondHalf.next;
        secondHalf.next=null;

        ListNode fr= reverse(head);

        head.next=reverseKGroup(second,k);
        return fr;
       
    }

    public ListNode reverse(ListNode head)
    {
        ListNode prev= null;
        while(head!=null)
        {
            ListNode next= head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }
}
