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
        if(root==null || (root.left==null && root.right==null)) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int left=height(root.left);
        int right=height(root.right);
        int height=left+right;
        if(root.left!=null) height++;
        if(root.right!=null) height++;
        return Math.max(height,Math.max(diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right)));
    }
}