class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int count=0;
        int ans=0;
        for(int i=0;i<n;i++){
            if(count==0){
                ans=nums[i];
                count=1;
            }
            else if(nums[i]==ans){
                count++;
            }
            else{
                count--;
            }
        }
        return ans;
    }
}