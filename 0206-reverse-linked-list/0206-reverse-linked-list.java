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
    private ListNode helper(ListNode ptr){
        if(ptr==null ||ptr.next==null) return ptr;
        ListNode p=helper(ptr.next);
        ptr.next.next=ptr;
        ptr.next=null;
        return p;
    }
    public ListNode reverseList(ListNode head) {
       ListNode ptr=head;
       return helper(ptr);
    }
}