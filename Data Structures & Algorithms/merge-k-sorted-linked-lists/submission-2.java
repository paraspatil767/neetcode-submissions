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
    public ListNode mergeKLists(ListNode[] lists) {
            PriorityQueue<ListNode> pq= new PriorityQueue<>((a,b)->{
                return Integer.compare(a.val,b.val);
            });
            ListNode alist= new ListNode();
            ListNode p=alist;
            for(ListNode list : lists)
            {
                if(list!=null)
                {
                    pq.offer(list);
                }
            }

            while(!pq.isEmpty())
            {
                ListNode temp= pq.poll();
                if(temp.next!=null)
                {
                pq.offer(temp.next);
                }
                temp.next=null;
                alist.next=temp;
                alist=alist.next;

            }

            return p.next;
    }
}
