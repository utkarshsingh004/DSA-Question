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
    private int height(TreeNode root, int diameter[]){
        if(root==null || (root.left==null && root.right==null)) return 0;
        int left=height(root.left,diameter);
        int right=height(root.right,diameter);
        int max=left+right;
        if(root.left!=null) max++;
        if(root.right!=null) max++;
        diameter[0]=Math.max(diameter[0],max);
        return 1+Math.max(left,right);

    }
    public int diameterOfBinaryTree(TreeNode root) {
        int arr[]=new int[1];
        height(root,arr);
        return arr[0];
    }
}