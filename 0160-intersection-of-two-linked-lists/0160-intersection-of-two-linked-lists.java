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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        ListNode temp2=headB;
        int sizeA=0;
        int sizeB=0;
        while(temp1!=null){
            sizeA++;
            temp1=temp1.next;
        }
        while(temp2!=null){
            sizeB++;
            temp2=temp2.next;
        }
        temp1=headA;
        temp2=headB;
        int difference=0;
        if(sizeA>sizeB){
            difference=sizeA-sizeB;
            for(int i=1;i<=difference;i++){
                temp1=temp1.next;
            }
        }
        else{
            difference=sizeB-sizeA;
             for(int i=1;i<=difference;i++){
                temp2=temp2.next;
            }
        }

        while(temp1!=null && temp2!=null){
            if(temp1==temp2){
                return temp1;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return null;
    }
}