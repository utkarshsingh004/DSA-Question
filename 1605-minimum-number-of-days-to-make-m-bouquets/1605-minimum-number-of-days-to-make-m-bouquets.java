class Solution {
    private int total(int arr[], int mid, int k){
        int count=0;
        int t=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=mid){
                count++;
                if(count==k){
                    t++;
                    count=0;
                }
            }
            else{
                count=0;
            }
        }
        return t;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<n;i++){
            if(max<bloomDay[i]){
                max=bloomDay[i];
            }
            if(min>bloomDay[i]){
                min=bloomDay[i];
            }
        }
        int i=min;
        int j=max;
        int ans=-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            int a=total(bloomDay,mid,k);
            System.out.println(mid);
            if(a>=m){
                ans=mid;
                // i=mid+1;
                j=mid-1;
            }
            else{
                // j=mid-1;
                i=mid+1;
            }
        }
        return ans;
    }
}