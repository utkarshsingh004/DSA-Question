class Solution {
    public int integerBreak(int n) {

        int max = 0;

        for (int k = 2; k <= n; k++) {

            for (int i = 1; i < n; i++) {

                int remaining = n - (k - 1) * i;

                if (remaining <= 0)
                    break;

                int mul = 1;

                // i^(k-1)
                for (int j = 0; j < k - 1; j++) {
                    mul *= i;
                }

                mul *= remaining;

                max = Math.max(max, mul);
            }
        }

        return max;
    }
}