class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int freq=1;
        int ans=nums[0];
        for(int i=1;i<n;i++){
            if(freq==0){
                ans=nums[i];
            }
            if(nums[i]==ans){
                freq++;
            }
            else{
                freq--;
            }
        }
        return ans;
    }
}