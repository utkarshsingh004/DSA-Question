class Solution {
    private void traversal(TreeNode root, TreeMap<Integer, List<int[]>> t, int col, int row) {
        if (root == null) return;

        t.putIfAbsent(col, new ArrayList<>());
        t.get(col).add(new int[]{row, root.val});

        traversal(root.left, t, col - 1, row + 1);
        traversal(root.right, t, col + 1, row + 1);
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, List<int[]>> t = new TreeMap<>();
        traversal(root, t, 0, 0);

        List<List<Integer>> result = new ArrayList<>();
        for (List<int[]> colNodes : t.values()) {
            // Sort first by row, then by value
            colNodes.sort((a, b) -> {
                if (a[0] != b[0]) return a[0] - b[0]; // row first
                return a[1] - b[1]; // value next
            });

            List<Integer> colVals = new ArrayList<>();
            for (int[] p : colNodes) {
                colVals.add(p[1]);
            }
            result.add(colVals);
        }

        return result;
    }
}
