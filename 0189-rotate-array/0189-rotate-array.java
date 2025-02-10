class Solution {
    public void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  // Ensure k is within bounds

        // Step 1: Reverse the entire array
        reverse(nums, 0, n - 1);
        
        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);
        
        // Step 3: Reverse the remaining n-k elements
        reverse(nums, k, n - 1);
    }
}
