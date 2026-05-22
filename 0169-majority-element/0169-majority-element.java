class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int f=1;
        int e=nums[0];
        for(int i=1;i<n;i++){
            if(f==0) e=nums[i];
           if(nums[i]==e) f++;
           else f--;
        }
        return e;
    }
}