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
    public ListNode reverseList(ListNode head) {
        Stack<Integer>s = new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            s.push(temp.val);
            temp=temp.next;
        }
        ListNode t = null;
        ListNode t2=null;
        while(s.size()!=0){
            int a=s.pop();
            ListNode ptr = new ListNode(a);
            if(t==null){
                t=ptr;
            }
            else{
                t2.next=ptr;
            }
            t2=ptr;
        }
    return t;
    }
}