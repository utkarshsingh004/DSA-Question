class Solution {
    private int weight(int arr[], int mid){
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
        if(sum!=0) count++;
        System.out.print(count);
        return count;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int sum=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(max<weights[i]){
                max=weights[i];
            }
            sum+=weights[i];
        }
        int i=max;
        int j=sum;
        int ans=0;
        while(i<=j){
            int mid=i+(j-i)/2;
            int a=weight(weights,mid);
            if(a<=days){
               ans=mid;
               j=mid-1;
            }
            else i=mid+1;
        }
        return ans;
    }
}