class Solution {
    public void moveZeroes(int[] nums) {
    int n=nums.length;
    int k=0;
    for(int i=0;i<n;i++){
        if(nums[i]!=0){
            nums[k++]=nums[i];
        }
    }
    for(int i=k;i<n;i++){
        nums[i]=0;
    }
    }
}