class Solution {
   
    private int helper(int nums[], int mid, int k){
        int n=nums.length;
        int count=0;
        int c=0;
        for(int i=0;i<n;i++){
            if(nums[i]<=mid) count++;
            else count=0;
            if(count==k){
                c++;
                count=0;
            }
        }
        return c;
    }

    public int minDays(int[] nums, int m, int k) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        int i=min;
        int j=max;
        int idx=-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            int a=helper(nums,mid,k);
            System.out.println(a);
            if(a>=m){
                idx=mid;
                j=mid-1;
            }
            else i=mid+1;
        }
        return idx;
    }
}