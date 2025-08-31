class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        HashSet<List<Integer>> h = new HashSet<>();
        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                long res = (long) target - ((long) nums[i] + (long) nums[j]); // use long

                HashSet<Long> hm = new HashSet<>();
                for (int k = j + 1; k < n; k++) {
                    long needed = res - nums[k]; // also long

                    if (hm.contains(needed)) {
                        List<Integer> l = Arrays.asList(nums[i], nums[j], nums[k], (int) needed);
                        l.sort(null);
                        h.add(l);
                    } else {
                        hm.add((long) nums[k]);
                    }
                }
            }
        }

        return new ArrayList<>(h);
    }
}
