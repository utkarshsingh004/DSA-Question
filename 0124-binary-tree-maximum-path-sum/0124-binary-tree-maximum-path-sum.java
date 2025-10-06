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
    private int helper(TreeNode root, int arr[]){
        if(root==null) return 0;
        int left=Math.max(0,helper(root.left,arr));
        int right=Math.max(0,helper(root.right,arr));
        arr[0]=Math.max(arr[0],(root.val+left+right));
        return root.val+Math.max(left,right);
    }
    public int maxPathSum(TreeNode root) {
        int arr[]=new int[1];
        arr[0]=root.val;
        helper(root,arr);
        return arr[0];
    }
}