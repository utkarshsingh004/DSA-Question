import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        int n = nums.length;
        int s = 1 << n; // total subsets = 2^n

        for (int i = 0; i < s; i++) {
            List<Integer> a = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    a.add(nums[j]);
                }
            }
            arr.add(a);
        }
        return arr;
    }
}
