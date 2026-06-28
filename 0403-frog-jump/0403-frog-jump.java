class Solution {
    private boolean helper(int nums[], int c, int p, HashMap<Integer,Integer> h, Boolean dp[][]){
        if(c==nums[nums.length-1]) return true;
        if(c>nums[nums.length-1]) return false;
        if(!h.containsKey(c)) return false;
         if (dp[h.get(c)][h.get(p)] != null)
            return dp[h.get(c)][h.get(p)];
        int j=c-p;
        boolean f=(j>1)?helper(nums,c+j-1,c,h,dp):false;
        boolean s=helper(nums,c+j,c,h,dp);
        boolean t=helper(nums,c+j+1,c,h,dp);
        return dp[h.get(c)][h.get(p)]=f||s||t;
    }
    public boolean canCross(int[] stones) {
        HashMap<Integer,Integer> h =new HashMap<>();
        Boolean dp[][] = new Boolean[stones.length][stones.length + 1];
        for(int i=0;i<stones.length;i++){
            h.put(stones[i],i);
        }
        return helper(stones,1,0,h,dp);
    }
}