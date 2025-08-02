class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int i=0;
        int j=n-1;
        int m=0;
        while(m<=j){
            if(nums[m]==0){
                int temp=nums[m];
                nums[m]=nums[i];
                nums[i]=temp;
                m++;
                i++;
            }
            else if(nums[m]==2){
                int temp=nums[m];
                nums[m]=nums[j];
                nums[j]=temp;
                j--;
            }
            else{
                m++;
            }
        }
    }
}