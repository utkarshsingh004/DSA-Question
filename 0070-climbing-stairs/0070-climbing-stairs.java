class Solution {
    public int climbStairs(int n) {
        if(n==1 || n==2) return n;
        int dp[]=new int[n];
        dp[0]=1;
        dp[1]=2;
        for(int i=2;i<n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n-1];
    }
}

// class Solution {
//     private int climb(int i, int n, int dp[]){
//         if(i==n){
//             return 1;
//         }
//         if(i>n) return 0;
//         if(dp[i]!=-1) return dp[i];
//         int step=climb(i+1,n,dp);
//         int step2=climb(i+2,n,dp);
//         return dp[i]=step+step2;
//     }
//     public int climbStairs(int n) {
//         int dp[]=new int[n+1];
//         Arrays.fill(dp,-1);
//         return climb(0,n,dp);
//     }
// }