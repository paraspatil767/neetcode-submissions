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
        Map<Node,Node> map=new HashMap<>();

        Node temp=head;
        while(temp!=null)
        {
            map.put(temp,new Node(temp.val));
            temp=temp.next;
        }
        Node nHead=null;
        Node t=head;

        while(t!=null)
        {
            Node s=map.get(t);
            nHead=s;
            nHead.random=map.get(t.random);
            nHead.next=map.get(t.next);
            t=t.next;
        }
        return map.get(head);

    }
}
