class Solution {
    public int maxScore(int[] arr, int k) {
        int n = arr.length;
        
        // Step 1: take first k cards
        int leftSum = 0;
        for (int i = 0; i < k; i++) {
            leftSum += arr[i];
        }
        
        int max = leftSum;
        int rightSum = 0;
        
        // Step 2: replace from the back one by one
        for (int i = 0; i < k; i++) {
            rightSum += arr[n - 1 - i];   // add from back
            leftSum -= arr[k - 1 - i];    // remove from front
            max = Math.max(max, leftSum + rightSum);
        }
        
        return max;
    }
}
