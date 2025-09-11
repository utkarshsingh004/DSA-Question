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
    private ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private ListNode merge(ListNode left, ListNode right){
        ListNode temp=new ListNode(-1);
        ListNode t=temp;
        while(left!=null && right!=null){
            if(left.val<=right.val){
                t.next=left;
                left=left.next;
            }
            else{
                t.next=right;
                right=right.next;
            }
            t=t.next;
        }
        if(left!=null){
            t.next=left;
        }
        if(right!=null){
            t.next=right;
        }
        return temp.next;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode temp=middle(head);
        ListNode right=temp.next;
        temp.next=null;
        ListNode left = sortList(head);
        right=sortList(right);
        return merge(left,right);
    }
}