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

    private int height(TreeNode root){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 0;
        }
        int a=1+Math.max(height(root.left),height(root.right));
        return a;
    }

    public int diameterOfBinaryTree(TreeNode root) {
         if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 0;
        }

        int left=diameterOfBinaryTree(root.left);
        int right=diameterOfBinaryTree(root.right);
        
        int a=height(root.left)+height(root.right);
        if(root.left!=null) a++;
        if(root.right!=null) a++;
        
        int max = Math.max(a,Math.max(left,right));
        return max;
    }
}