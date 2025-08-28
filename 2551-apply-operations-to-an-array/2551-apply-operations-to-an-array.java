class Solution {
    private void moveZeroes(int[] nums) {
        int n=nums.length;
        int i=0;
        int j=i+1;
        while(i<n-1 && j<n){
            if(nums[i]==0 && nums[j]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
            else if(nums[i]==0 && nums[j]==0){
                j++;
            }
            else{
                i++;
                j++;
            }
        }
    }
    public int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        }
        moveZeroes(nums);
        return nums;
    }
}