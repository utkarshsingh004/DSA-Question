class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int p=nums[0];
        int q=nums[0];
        int max=nums[0];
        for(int i=1;i<n;i++){
            int temp=Math.max(nums[i],Math.max(p*nums[i],q*nums[i]));
            q=Math.min(nums[i],Math.min(p*nums[i],q*nums[i]));
            p=temp;
            max=Math.max(max,p);
        }
        return max;
    }
}