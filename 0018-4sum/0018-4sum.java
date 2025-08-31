class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);  // must sort first

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;  // skip duplicates

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;  // skip duplicates

                int k = j + 1, l = n - 1;
                long t = (long) target - ((long) nums[i] + (long) nums[j]); // use long

                while (k < l) {
                    long sum = (long) nums[k] + (long) nums[l];
                    if (sum == t) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        k++;
                        l--;
                        while (k < l && nums[k] == nums[k - 1]) k++;
                        while (k < l && nums[l] == nums[l + 1]) l--;
                    } else if (sum < t) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }
        return ans;
    }
}
