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
    private ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;
    
    while (curr != null) {
        ListNode nextTemp = curr.next; 
        curr.next = prev;             
        prev = curr;                  
        curr = nextTemp;               
    }
    
    return prev; 
}

    public boolean isPalindrome(ListNode head) {
        ListNode fast=head;
        ListNode slow=fast;
        while(fast.next!=null && fast.next.next!=null){
             slow=slow.next;
             fast=fast.next.next;
        }
        ListNode temp1=head;
        ListNode temp2=reverseList(slow.next);
        while(temp2!=null){
            if(temp1.val!=temp2.val){
                return false;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        // if(temp2.val==2){
        //     return true;
        // }
        return true;
    }
}