class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for(int i = 0; i < n - 2; i++) {
            // Skip duplicate values for i
            if(i > 0 && nums[i] == nums[i - 1]) continue;

            int target = -nums[i];
            int j = i + 1, k = n - 1;

            while(j < k) {
                int sum = nums[j] + nums[k];
                if(sum == target) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    // Skip duplicates for j and k
                    while(j < k && nums[j] == nums[j + 1]) j++;
                    while(j < k && nums[k] == nums[k - 1]) k--;

                    j++;
                    k--;
                } else if(sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return result;
    }
}
