class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i<n-1){
            if(nums[i]==0){
                int j=i;
                while(j<n-1 && nums[j]==0){
                    j++;
                }
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            }
            i++;
        } 
    }
}