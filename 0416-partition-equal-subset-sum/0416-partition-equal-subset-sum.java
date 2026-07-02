class Solution {
    private boolean helper(int nums[], int idx, int sum, Boolean dp[][]){
        if(sum==0) return true;
        if(idx>=nums.length || sum<0) return false;
        if(dp[idx][sum]!=null) return dp[idx][sum];
        return dp[idx][sum]=helper(nums,idx+1,sum-nums[idx],dp) || helper(nums,idx+1,sum,dp);
    }
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        if(sum%2==1) return false;
        Boolean dp[][]=new Boolean[n][(sum/2)+1];
        return helper(nums,0,sum/2,dp);
    }
}