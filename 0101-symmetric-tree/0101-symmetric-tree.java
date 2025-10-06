/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private boolean palindrome(List<Integer> a){
        int i=0;
        int j=a.size()-1;
        while(i<j){
            if(a.get(i)!=a.get(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q= new LinkedList<>();
        if(root==null) return true;
        q.add(root);
        while(q.size()>0){
            int s=q.size();
            List<Integer> l1=new ArrayList<>();
            for(int i=0;i<s;i++){
            TreeNode temp=q.peek();
            if(temp!=null){
                q.add(temp.left);
            q.add(temp.right);
            l1.add(temp.left!=null?temp.left.val:null);
            l1.add(temp.right!=null?temp.right.val:null);
            }
            q.remove();
            }
            if(!palindrome(l1)) return false;
        }
        return true;
    }
}