class Solution {

    private int max(int[] arr) {
        int m = 0;
        for (int val : arr) {
            m = Math.max(m, val);
        }
        return m;
    }

    private int sum(int[] arr) {
        int m = 0;
        for (int val : arr) {
            m += val;
        }
        return m;
    }

    private int total(int[] arr, int capacity) {
        int days = 1;
        int sum = 0;
        for (int weight : arr) {
            if (sum + weight > capacity) {
                days++;
                sum = 0;
            }
            sum += weight;
        }
        return days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int i = max(weights);
        int j = sum(weights);
        int ans = j;

        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (total(weights, mid) <= days) {
                ans = mid;
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return ans;
    }
}
