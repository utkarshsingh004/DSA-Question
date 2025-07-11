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
        int a = 1+Math.max(height(root.left), height(root.right));
        return a;
    }

    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        int leftTree = height(root.left);
        if(root.left!=null) leftTree++;
        int rightTree = height(root.right);
        if(root.right!=null) rightTree++;
        int a = Math.abs(leftTree-rightTree);
        if(a>1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
}