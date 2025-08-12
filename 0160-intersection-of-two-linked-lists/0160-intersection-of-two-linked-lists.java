/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    private int size(ListNode head){
        int s=0;
        while(head!=null){
            s++;
            head=head.next;
        }
        return s;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int n1=size(headA);
        int n2=size(headB);
        if(n1>n2){
            for(int i=0;i<n1-n2;i++){
                headA=headA.next;
            }
        }
        else{
             for(int i=0;i<n2-n1;i++){
                headB=headB.next;
            }
        }
        while(headA!=null && headB!=null){
            if(headA==headB){
                return headA;
            }
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }
}