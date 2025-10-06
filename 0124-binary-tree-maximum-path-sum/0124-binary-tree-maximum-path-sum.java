class Solution {
    private int maxSum;

    private int helper(TreeNode root) {
        if (root == null) return 0;

        // Ignore negative contributions
        int left = Math.max(0, helper(root.left));
        int right = Math.max(0, helper(root.right));

        // Update global max: best path through this node
        maxSum = Math.max(maxSum, root.val + left + right);

        // Return best branch to parent
        return root.val + Math.max(left, right);
    }

    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        helper(root);
        return maxSum;
    }
}
