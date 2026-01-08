class Solution {
    public void nextPermutation(int[] nums) {
        int idx=-1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                idx=i-1;
                break;
            }
        }
        if(idx==-1){
            Arrays.sort(nums);
            return;
        }
        int j=-1;
        int min=Integer.MAX_VALUE;
        for(int i=idx+1;i<nums.length;i++){
            if(nums[i]>nums[idx] && nums[i]<min){
                min=nums[i];
                j=i;
            }
        }
        int temp=nums[idx];
        nums[idx]=nums[j];
        nums[j]=temp;
        Arrays.sort(nums,idx+1,nums.length);
    }
}