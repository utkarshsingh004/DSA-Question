class Solution {
    private int minimum(int arr[], int mid){
        int n=arr.length;
        int t=0;
        int sum=0;
        for(int i=0;i<n;i++){
           sum+=arr[i];
           if(sum==mid){
            t++;
            sum=0;
           }
           else if(sum>mid){
            t++;
            sum=arr[i];
           }
        }
        if(sum!=0){
            t++;
        }
        return t;
    }
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        int max=0;
        int sum=0;
        for(int i=0;i<n;i++){
            if(max<nums[i]){
                max=nums[i];
            }
            sum+=nums[i];
        }
        int i=max;
        int j=sum;
        int ans=0;
        while(i<=j){
            int mid=i+(j-i)/2;
            int a=minimum(nums,mid);
            if(a<=k){
                ans=mid;
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return ans;
    }
}