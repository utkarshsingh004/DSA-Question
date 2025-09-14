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
        HashMap<Node,Node> h = new HashMap<>();
        Node t=head;
        while(t!=null){
            Node temp=new Node(t.val);
            h.put(t,temp);
            t=t.next;
        }
        t=head;
        while(t!=null){
            Node ptr=h.get(t);
            ptr.next=h.get(t.next);
            ptr.random=h.get(t.random);
            t=t.next;
        }
        return h.get(head);
    }
}