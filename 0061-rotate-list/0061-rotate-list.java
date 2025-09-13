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
    // private ListNode reverse(ListNode head){
    //     if(head==null || head.next==null) return head;
    //        Node ptr=reverse()
    // }
    private int position(ListNode head, int k){
        ListNode temp=head;
        int s=0;
        while(temp!=null){
            s++;
            temp=temp.next;
        }
        return s;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        int size=position(head,k);
        k=k%size;
        int pos=size-k+1;
        if(pos>size) return head;
        ListNode temp=head;
        for(int i=1;i<pos-1;i++){
            temp=temp.next;
        }
        ListNode temp2=temp.next;
        temp.next=null;
        if(temp2.next!=null){
            ListNode temp3=temp2;
           while(temp3.next!=null){
            temp3=temp3.next;
           }
        temp3.next=head;
        }
        else temp2.next=head;
        return temp2;

    }
}