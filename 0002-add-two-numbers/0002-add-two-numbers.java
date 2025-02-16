class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); // Dummy node to build the result list
        ListNode current = dummy; // Pointer to track the last node
        int carry = 0;

        while (l1 != null || l2 != null || carry > 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10; // Compute new carry
            current.next = new ListNode(sum % 10); // Store single-digit sum in the new node
            current = current.next;
        }

        return dummy.next; // Return the real head (dummy's next)
    }
}
