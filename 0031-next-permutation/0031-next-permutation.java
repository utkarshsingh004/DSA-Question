class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int idx=-1;
        for(int i=n-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                idx=i-1;
                break;
            }
        }
        if(idx==-1){
            Arrays.sort(nums);
            return;
        }
        int min=idx+1;
        for(int j=idx+1;j<n;j++){
            if(nums[min]>nums[j] && nums[j]>nums[idx]){
                min=j;
            }
        }
        int temp=nums[idx];
        nums[idx]=nums[min];
        nums[min]=temp;
        Arrays.sort(nums,idx+1,n);
    }
}