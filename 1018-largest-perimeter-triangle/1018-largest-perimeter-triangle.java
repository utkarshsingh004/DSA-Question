class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        for(int k=nums.length-1;k>=2;k--){
            int j=k-1;
            for(int i=0;i<j;i++){
                if(nums[i]+nums[j]>nums[k]){
                    max=Math.max(max,nums[i]+nums[j]+nums[k]);
                }
            }
        }
        return max;
    }
}