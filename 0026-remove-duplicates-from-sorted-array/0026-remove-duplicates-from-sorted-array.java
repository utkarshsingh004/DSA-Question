class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k=1;
        for(int i=1;i<n;i++){
          if(nums[i-1]!=nums[i]){
            nums[k++]=nums[i];
          }
        }
        return k;
    }
}