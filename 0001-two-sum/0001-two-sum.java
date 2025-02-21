class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int ans[] = new int[2];
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    ans[k++]=i;
                    ans[k++]=j;
                }
            }
        }
        return ans;
    }
}