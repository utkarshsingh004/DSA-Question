class Solution {
    private ListNode middle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // last node of left half
    }

    private ListNode merge(ListNode h1, ListNode h2) {
        ListNode temp = new ListNode(0);
        ListNode t = temp;
        while (h1 != null && h2 != null) {
            if (h1.val < h2.val) {
                t.next = h1;
                h1 = h1.next;
            } else {
                t.next = h2;
                h2 = h2.next;
            }
            t = t.next;
        }
        if (h1 != null) t.next = h1;
        if (h2 != null) t.next = h2;
        return temp.next;
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode mid = middle(head);
        ListNode right = mid.next;
        mid.next = null;
        ListNode left = sortList(head);
        right = sortList(right);
        return merge(left, right);
    }
}
