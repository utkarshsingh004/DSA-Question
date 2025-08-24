import java.util.*;

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int idx = -1;

        // Step 1: find the first decreasing element from right
        for(int i = n - 1; i > 0; i--){
            if(nums[i - 1] < nums[i]){
                idx = i - 1;
                break;
            }
        }

        // Step 2: if no such element, sort (i.e. reverse to smallest permutation)
        if(idx == -1){
            Arrays.sort(nums);
            return;
        }

        // Step 3: find the smallest element greater than nums[idx]
        int min = Integer.MAX_VALUE;
        int j = -1;
        for(int i = idx + 1; i < n; i++){
            if(nums[i] > nums[idx] && nums[i] <= min){
                min = nums[i];
                j = i;
            }
        }

        // Step 4: swap nums[idx] and nums[j]
        int temp = nums[idx];
        nums[idx] = nums[j];
        nums[j] = temp;

        // Step 5: sort suffix
        Arrays.sort(nums, idx + 1, n);
    }
}
