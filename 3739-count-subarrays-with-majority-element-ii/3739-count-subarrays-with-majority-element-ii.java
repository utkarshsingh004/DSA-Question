class Solution {

    class Fenwick {
        int[] bit;
        int n;

        Fenwick(int n) {
            this.n = n;
            bit = new int[n + 1];
        }

        void update(int idx, int val) {
            while (idx <= n) {
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

    public long countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;

        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + (nums[i] == target ? 1 : -1);
        }

        int[] vals = prefix.clone();
        Arrays.sort(vals);

        ArrayList<Integer> list = new ArrayList<>();
        for (int x : vals) {
            if (list.isEmpty() || list.get(list.size() - 1) != x) {
                list.add(x);
            }
        }

        Fenwick bit = new Fenwick(list.size());

        long ans = 0;

        for (int p : prefix) {
            int pos = Collections.binarySearch(list, p) + 1;
            ans += bit.query(pos - 1);
            bit.update(pos, 1);
        }

        return ans;
    }
}