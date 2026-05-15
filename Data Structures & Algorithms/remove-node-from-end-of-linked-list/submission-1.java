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

        int len = length(head);

        // remove head
        if(n == len)
        {
            return head.next;
        }

        ListNode curr = head;

        for(int i = 0; i < len - n - 1; i++)
        {
            curr = curr.next;
        }

        curr.next = curr.next.next;

        return head;
    }

    public int length(ListNode head)
    {
        if(head == null)
        {
            return 0;
        }

        return 1 + length(head.next);
    }
}
