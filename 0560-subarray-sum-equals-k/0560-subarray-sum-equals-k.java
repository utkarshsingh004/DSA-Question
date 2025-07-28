class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;

        map.put(0, 1); 
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            int rem = sum - k;

            if (map.containsKey(rem)) {
                count += map.get(rem);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
