class Solution {
    // private boolean helper(int nums[], int idx, int sum, Boolean dp[][]){
    //     if(sum==0) return true;
    //     if(idx>=nums.length || sum<0) return false;
    //     if(dp[idx][sum]!=null) return dp[idx][sum];
    //     return dp[idx][sum]=helper(nums,idx+1,sum-nums[idx],dp) || helper(nums,idx+1,sum,dp);
    // }
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        if(sum%2==1) return false;
        int target=sum/2;
        boolean dp[][]=new boolean[n+1][target+1];
        for(int i=0;i<n;i++){
            dp[i][0]=true;
        }

        for(int i=n-1;i>=0;i--){
            for(int j=1;j<=target;j++){
                boolean inc=false;
                if(j-nums[i]>=0){
                    inc=dp[i+1][j-nums[i]];
                }
                boolean ex=dp[i+1][j];
                dp[i][j]=inc||ex;
            }
        }
        return dp[0][target];
    }
}