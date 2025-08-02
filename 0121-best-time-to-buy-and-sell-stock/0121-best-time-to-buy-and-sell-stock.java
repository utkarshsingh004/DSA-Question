class Solution {
    public int maxProfit(int[] nums) {
        int n=nums.length;
        int cp=nums[0];
        int sp=0;
        int p=0;
        for(int i=0;i<n;i++){
            if(cp>nums[i]){
                cp=nums[i];
            }
            sp=nums[i]-cp;
            p=Math.max(p,sp);
        }
        return p;
    }
}