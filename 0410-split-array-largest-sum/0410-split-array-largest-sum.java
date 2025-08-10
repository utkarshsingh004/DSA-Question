class Solution {

    private int array(int arr[], int mid){
        int n=arr.length;
        int count=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==mid){
                count++;
                sum=0;
            }
            else if(sum>mid){
                count++;
                sum=arr[i];
            }
        }
        if(sum!=0){
            count++;
        }
        return count;
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
            if(array(nums, mid)<=k){
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