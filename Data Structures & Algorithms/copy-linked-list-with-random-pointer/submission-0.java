/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map=new HashMap<>();

        Node temp1=head;
        Node newhead=new Node(-1);
        Node temp2=newhead;
        while (temp1!=null)
        {
            temp2.next=new Node(temp1.val);
            temp2=temp2.next;
            map.put(temp1,temp2);
            temp1=temp1.next;
        }
        Node temp4=head;
        Node temp3=newhead.next;
        while(temp4!=null)
        {
            temp3.random=map.get(temp4.random);
            temp3=temp3.next;
            temp4=temp4.next;
        }
        return newhead.next;
        
    }
}
