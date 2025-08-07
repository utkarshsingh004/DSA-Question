class Solution {

    private int max(int arr[][], int mid) {
        int n = arr.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[max][mid] < arr[i][mid]) {
                max = i;
            }
        }
        return max;
    }

    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[] arr = new int[2];  // use 'arr' since that's what you used
        int i = 0;
        int j = m - 1;

        while (i <= j) {
            int mid = i + (j - i) / 2;
            int maxElement = max(mat, mid);

            // Safe boundary checks
            boolean leftCheck = (mid == 0) || (mat[maxElement][mid] > mat[maxElement][mid - 1]);
            boolean rightCheck = (mid == m - 1) || (mat[maxElement][mid] > mat[maxElement][mid + 1]);

            if (leftCheck && rightCheck) {
                arr[0] = maxElement;
                arr[1] = mid;
                return arr;
            } else if (mid < m - 1 && mat[maxElement][mid] < mat[maxElement][mid + 1]) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }

        return new int[]{-1, -1};
    }
}
