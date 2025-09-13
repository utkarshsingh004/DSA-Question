class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return null;

        // Step 1: Build copy list separately
        Node t = new Node(-1);
        Node t1 = t;
        Node h1 = head;
        while(h1!=null){
            Node temp = new Node(h1.val);
            t1.next = temp;
            t1 = temp;
            h1 = h1.next;
        }
        t = t.next; // ✅ skip dummy, now t is head of copy list

        // Step 2: Interleave
        Node ptr = new Node(-1);
        Node p = ptr;
        Node p1 = head;
        Node p2 = t;

        while(p1!=null && p2!=null){
            p.next = p1;
            p = p1;
            p1 = p1.next;

            p.next = p2;
            p = p2;
            p2 = p2.next;
        }

        // Step 3: Assign random pointers
        p1 = head;
        p2 = t;
        while(p1!=null && p2!=null){
            if(p1.random==null) p2.random=null;
            else p2.random = p1.random.next;
            p1 = (p1.next!=null) ? p1.next.next : null;
            p2 = (p2.next!=null) ? p2.next.next : null;
        }

        // Step 4: Separate original and copy
        p1 = head;
        p2 = t;
        while (p1 != null && p2 != null) {
            p1.next = p2.next;   // restore original
            p1 = p1.next;

            if (p1 != null) {    // check before assigning
                p2.next = p1.next; // link copy
                p2 = p2.next;
            }
        }

        return t; // ✅ return copied list head
    }
}
