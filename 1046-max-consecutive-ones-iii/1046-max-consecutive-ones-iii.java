class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int max=0;
        int count=0;
        int l=0;
        int r=0;
        while(r<n){
            if(nums[r]==0){
                count++;
            }
            if(count>k){
                    if(nums[l]==0){
                        count--;
                    }
                    l++;
                }
            r++;
            max=Math.max(max,r-l);
        }
        return max;
    }
}