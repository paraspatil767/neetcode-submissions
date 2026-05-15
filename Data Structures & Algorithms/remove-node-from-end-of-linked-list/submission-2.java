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
    public ListNode removeNthFromEnd(ListNode head, int n) {

            int num= length(head,0);
            if(num==n)
            {
                return head.next;
            }
            ListNode dummy=head;
            for (int i=0;i<num-n-1;i++)
            {
                dummy=dummy.next;
            }
            dummy.next=dummy.next.next;

    return head;

    }

    public static int length(ListNode head,int count)
    {
        if(head==null)
        {
            return count;
        }
        else
        {
            count=length(head.next,count+1);
            
        }
        return count;

    }
}
