class Solution {
    public int maxProduct(int[] arr) {
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int pre=1;
        int suff=1;
        for (int i = 0; i < n; i++) {
            if (pre == 0) pre = 1;
            if (suff == 0) suff = 1;
            pre *= arr[i];
            suff *= arr[n - i - 1];
            max = Math.max(max, Math.max(pre, suff));
        }
        return max;
    }
}