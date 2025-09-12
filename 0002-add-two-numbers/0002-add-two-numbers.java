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
    private int size(ListNode head) {
        int s = 0;
        while (head != null) {
            s++;
            head = head.next;
        }
        return s;
    }

    private int add(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null) return carry;

        int sum = carry;
        if (l1 != null) sum += l1.val;
        if (l2 != null) sum += l2.val;

        int newCarry = sum / 10;
        int digit = sum % 10;

        if (l1 != null) l1.val = digit; // store result in l1

        // move to next nodes
        int nextCarry = add(l1 != null ? l1.next : null,
                            l2 != null ? l2.next : null,
                            newCarry);

        return nextCarry;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int m = size(l1), n = size(l2);
        if (m < n) return addTwoNumbers(l2, l1); // always keep l1 as longer

        int carry = add(l1, l2, 0);

        if (carry > 0) {
            ListNode temp = new ListNode(carry);
            ListNode ptr = l1;
            while (ptr.next != null) ptr = ptr.next;
            ptr.next = temp;
        }

        return l1;
    }
}
