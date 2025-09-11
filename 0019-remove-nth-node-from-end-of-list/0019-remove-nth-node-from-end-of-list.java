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
    private int element(ListNode head, int n){
        ListNode temp=head;
        int m=0;
        while(temp!=null){
            m++;
            temp=temp.next;
        }
        return m-n+1;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        if(n==size) return head.next;
        int pos=element(head,n);
        temp=head;
        for(int i=1;i<pos-1;i++){
           temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}