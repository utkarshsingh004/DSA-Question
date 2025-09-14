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
    private ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode temp=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        ListNode t=head;
        for(int i=1;i<k;i++){
            if(t.next==null) return head;
            t=t.next;
        }
        ListNode head2=t.next;
        t.next=null;
        ListNode newNode=reverseKGroup(head2,k);
        ListNode rev=reverse(head);
        System.out.print(rev.val+" ");
        ListNode p=rev;
        while(p.next!=null){
            // System.out.print(p.val+" ");
            p=p.next;
        }
        p.next=newNode;
        // ListNode rev=reverse(head);
        return rev;
    }
}