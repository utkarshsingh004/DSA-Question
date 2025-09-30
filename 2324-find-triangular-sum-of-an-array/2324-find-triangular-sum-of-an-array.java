class Solution {
    private int triangular(int n, int nums[]){
        if(n==1){
            return nums[0];
        }
        int arr[]=new int[n-1];
        for(int i=0;i<n-1;i++){
            arr[i]=(nums[i]+nums[i+1])%10;
        }
        int ans=triangular(n-1,arr);
        return ans;
    }
    public int triangularSum(int[] nums) {
        return triangular(nums.length,nums);
    }
}