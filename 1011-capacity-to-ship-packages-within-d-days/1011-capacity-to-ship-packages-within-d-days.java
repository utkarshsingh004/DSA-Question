class Solution {
    private int helper(int nums[], int mid){
        int n=nums.length;
        int sum=0;
        int k=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum>mid){
                k++;
                sum=nums[i];
            }
            else if(sum==mid) {
                k++;
                sum=0;
            }
        }
        if(sum>0) k++;
        return k;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int sum=0;
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,weights[i]);
            sum+=weights[i];
        }
        int i=max;
        int j=sum;
        int idx=-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            int a=helper(weights,mid);
            System.out.print(a);
            if(a<=days){
                idx=mid;
                j=mid-1;
            }
            else i=mid+1;
        }
        return idx;
    }
}