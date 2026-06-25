import java.util.*;

class Solution {

    class Fenwick {
        int[] bit;

        Fenwick(int n) {
            bit = new int[n + 2];
        }

        void update(int idx, int val) {
            while (idx < bit.length) {
                bit[idx] += val;
                idx += idx & -idx;
            }
        }

        int query(int idx) {
            int sum = 0;
            while (idx > 0) {
                sum += bit[idx];
                idx -= idx & -idx;
            }
            return sum;
        }
    }

    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;

        // Prefix sums
        int[] prefix = new int[n + 1];
        prefix[0] = 0;

        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + (nums[i - 1] == target ? 1 : -1);
        }

        // Coordinate Compression
        int[] sorted = prefix.clone();
        Arrays.sort(sorted);

        Map<Integer, Integer> map = new HashMap<>();
        int idx = 1;
        for (int x : sorted) {
            if (!map.containsKey(x)) {
                map.put(x, idx++);
            }
        }

        Fenwick bit = new Fenwick(idx);

        long ans = 0;

        for (int x : prefix) {
            int pos = map.get(x);

            // Count previous prefix sums < current prefix sum
            ans += bit.query(pos - 1);

            // Insert current prefix sum
            bit.update(pos, 1);
        }

        return (int) ans;
    }
}