class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count=0;
        int sum=0;
        for(int i=0;i<n;i++){
           sum+=nums[i];
           if(sum==k){
            count++;
            sum=0;
           }
        }
        return count;
    }
}