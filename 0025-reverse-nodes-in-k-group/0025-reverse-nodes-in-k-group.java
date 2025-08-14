class Solution {
    private ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = reverse(head.next);
        ListNode h = head.next;
        h.next = head;
        head.next = null;
        return temp;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1) return head;

        ListNode ans = null;
        ListNode prevGroupTail = null;

        ListNode temp = head;
        ListNode groupStart = head;
        int count = 0;

        while (temp != null) {
            count++;
            if (count == k) {
                ListNode nextGroupHead = temp.next;
                temp.next = null; // cut current group

                ListNode rev = reverse(groupStart);

                if (ans == null) ans = rev; // first group is head
                if (prevGroupTail != null) {
                    prevGroupTail.next = rev; // connect previous group
                }

                // move to end of reversed group
                prevGroupTail = groupStart;

                // setup for next group
                groupStart = nextGroupHead;
                temp = nextGroupHead;
                count = 0;
            } else {
                temp = temp.next;
            }
        }

        // If leftover nodes < k, attach them as is
        if (prevGroupTail != null) {
            prevGroupTail.next = groupStart;
        }

        return ans != null ? ans : head;
    }
}
