class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int ans[] = new int[n];
        int i=0;
        int j=1;
        for(int k=0;k<n;k++){
            if(nums[k]>=0){
             ans[i]=nums[k];
             i+=2;
            }
            else{
                ans[j]=nums[k];
                j+=2;
            }
        }
    return ans;






        // while(i<n-1){
        //    if(i%2==0){
        //     if(nums[i]<0 && nums[i+1]>=0){
        //         int temp = nums[i];
        //         nums[i] = nums[i+1];
        //         nums[i+1] = temp;
        //     }
        //    }
        //    else{
        //     if(nums[i]>=0 && nums[i+1]<0){
        //         int temp = nums[i];
        //         nums[i] = nums[i+1];
        //         nums[i+1] = temp;
        //     }
        //    }
        //    i++;
        // }
        // return nums;
    }
}