class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
              int mul=1;
            for(int j=i;j<n;j++){
                mul=mul*nums[j];
                max1=Math.max(max1,mul);
            }
            max2=Math.max(max2,max1);
        }
        return max2;
    }
}