class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        // int k=0;
        for(int i=2;i<n;i++){
            if(nums[i]==nums[i-2]){
                // nums[k++]=nums[i];
                nums[i-2]=Integer.MAX_VALUE;
            }
        }
        int k=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=Integer.MAX_VALUE){
                nums[k++]=nums[i];
            }
        }
        return k;
    }
}