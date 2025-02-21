class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int countA=0;
        int countB=0;
        int countC=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                countA++;
            }
            else if(nums[i]==1){
                countB++;
            }
            else{
                countC++;
            }
        }
        for(int i=0;i<n;i++){
            if(countA!=0){
                nums[i]=0;
                countA--;
            }
            else if(countB!=0){
                nums[i]=1;
                countB--;
            }
            else{
                nums[i]=2;
            }
        }
    }
}