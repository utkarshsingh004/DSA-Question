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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> l=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root!=null)q.add(root);
         boolean flag=true;
         while(q.size()>0){
            int s=q.size();
            List<Integer> l1=new ArrayList<>();
            for(int i=0;i<s;i++){
            TreeNode temp=q.peek();
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);
            l1.add(temp.val);
            q.remove();
            }
            if(!flag) Collections.reverse(l1);
            l.add(l1);
            flag=!flag;
        }
        return l;
    }
}