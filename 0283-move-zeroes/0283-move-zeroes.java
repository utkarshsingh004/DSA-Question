class Solution {
    public void moveZeroes(int[] nums) {
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
            if(nums[i]==0 && nums[j]==0) j++;
            if(nums[i]!=0){
                i++;
                j++;
            }
        }
    }
}