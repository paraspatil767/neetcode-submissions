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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        return merge( list1,  list2);
    }
    public ListNode merge(ListNode a, ListNode b)
    {
        ListNode temp1=a;
        ListNode temp2=b;
        ListNode temp3=new ListNode();
        ListNode dummy=temp3;
        while(temp1!=null && temp2!=null)
        {
            if(temp1.val>temp2.val)
            {
                temp3.next=temp2;
                temp2=temp2.next;
            }
            else
            {
                temp3.next=temp1;
                temp1=temp1.next;
            }
                temp3=temp3.next;
        }
        if(temp1==null && temp2!=null)
        {
            temp3.next=temp2;
        }
        else if(temp1!=null && temp2==null)
        {
            temp3.next=temp1;
        }
        return dummy.next;
    }
}