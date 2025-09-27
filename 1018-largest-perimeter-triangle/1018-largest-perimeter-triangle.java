class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int k=nums.length-1;k>=2;k--){
            int j=k-1;
            for(int i=j-1;i>=0;i--){
                if(nums[i]+nums[j]>nums[k]) return nums[i]+nums[j]+nums[k];
            }
        }
        return 0;
    }
}