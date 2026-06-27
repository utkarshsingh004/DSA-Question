class Solution {
    // private int helper(int nums[], int idx, int dp[]){
    //     if(idx<0) return 0;
    //     if(idx==0) return nums[0]; 
    //     if(dp[idx]!=-1) return dp[idx];
    //     int p=nums[idx]+helper(nums,idx-2,dp);
    //     int n=helper(nums,idx-1,dp);
    //     return dp[idx]=Math.max(p,n);
    // }
    public int rob(int[] nums) {
       int n=nums.length;
       if(n==1) return nums[0];
       if(n==2) return Math.max(nums[0],nums[1]);
       int p1=nums[0];
       int p2=Math.max(nums[0],nums[1]);
       for(int i=2;i<n-1;i++){
        int curr=Math.max(nums[i]+p1,p2);
        p1=p2;
        p2=curr;
       }
       p1=nums[n-1];
       int p3=Math.max(nums[n-2],nums[n-1]);
       for(int i=n-3;i>0;i--){
        int curr=Math.max(nums[i]+p1,p3);
        p1=p3;
        p3=curr;
       }
       return Math.max(p2, p3);
    }
}