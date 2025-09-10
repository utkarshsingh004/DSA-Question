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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if (root==null) return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
           int s=q.size();
           List<Integer> l =new ArrayList<>();
           for(int i=0;i<s;i++){
            TreeNode e = q.remove();
            l.add(e.val);
            if(e.left!=null) q.add(e.left);
            if(e.right!=null) q.add(e.right);
           }
           ans.add(l);
        }
        return ans;
    }
}