class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int left = 0;
        int right = cols - 1;

        while (left <= right) {
            int midCol = left + (right - left) / 2;
            int maxRow = 0;

            // Find row with max element in midCol
            for (int i = 0; i < rows; i++) {
                if (mat[i][midCol] > mat[maxRow][midCol]) {
                    maxRow = i;
                }
            }

            boolean leftIsBigger = midCol - 1 >= 0 && mat[maxRow][midCol - 1] > mat[maxRow][midCol];
            boolean rightIsBigger = midCol + 1 < cols && mat[maxRow][midCol + 1] > mat[maxRow][midCol];

            if (!leftIsBigger && !rightIsBigger) {
                // Found peak
                return new int[]{maxRow, midCol};
            } else if (leftIsBigger) {
                right = midCol - 1;
            } else {
                left = midCol + 1;
            }
        }

        return new int[]{-1, -1};
    }
}
