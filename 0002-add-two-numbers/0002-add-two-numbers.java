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
    private int helper2(ListNode head,int carry){
        if(head.next==null){
            int sum=head.val+carry;
            head.val=sum%10;
            return sum/10;
        }
        int sum=carry+head.val;
        head.val=sum%10;
        return helper2(head.next,sum/10);
    }
    private int helper(ListNode l1, ListNode l2, int carry){
        if(l2.next==null){
            int sum=carry+l1.val+l2.val;
            System.out.print(sum+" ");
            l1.val=sum%10;
            return sum/10;
        }
        int sum=carry+l1.val+l2.val;
        System.out.print(sum+" ");
        l1.val=sum%10;
        return helper(l1.next,l2.next,sum/10);
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int s1=0;
        int s2=0;
        ListNode ptr=l1;
        while(ptr!=null){
            s1++;
            ptr=ptr.next;
        }
        ptr=l2;
        while(ptr!=null){
            s2++;
            ptr=ptr.next;
        }
        if(s1==s2){
            System.out.print("First");
            ptr=l1;
            while(ptr.next!=null){
               ptr=ptr.next;
            }
            int carry=helper(l1,l2,0);
            if(carry>0){
               ListNode temp=new ListNode(carry);
                ptr.next=temp;
            } 
            return l1;
        }
        else if(s1>s2){
            ptr=l1;
            for(int i=0;i<s2;i++) ptr=ptr.next;
            int c=helper(l1,l2,0);
            if(c>0){
                int c1=helper2(ptr,c);{
                    if(c1>0){
                        System.out.print("F");
                        ptr=l1;
                        while(ptr.next!=null) ptr=ptr.next;
                        ListNode temp= new ListNode(c1);
                        ptr.next=temp;
                    }
                }
            }
            return l1;
        }
        else{
            ptr=l2;
            for(int i=0;i<s1;i++) ptr=ptr.next;
            int c=helper(l2,l1,0);
            if(c>0){
                int c1=helper2(ptr,c);{
                    if(c1>0){
                        System.out.print("S");
                        ptr=l2;
                        while(ptr.next!=null) ptr=ptr.next;
                        ListNode temp= new ListNode(c1);
                        ptr.next=temp;
                    }
                }
            }
            return l2;
        }
    }
}