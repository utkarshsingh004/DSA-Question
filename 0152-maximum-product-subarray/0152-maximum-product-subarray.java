class Solution {
    public int maxProduct(int[] nums) {
       int n=nums.length;
       int p=1; 
       int s=1;
       int max=Integer.MIN_VALUE;
       for(int i=0;i<n;i++){
        if(p==0) p=1;
        if(s==0) s=1;
        p*=nums[i];
        s*=nums[n-1-i];
        max=Math.max(max, Math.max(p,s));
       }
       return max;
    }
}