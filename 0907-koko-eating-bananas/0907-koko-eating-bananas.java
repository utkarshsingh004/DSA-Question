class Solution {
    private long time(int arr[], int mid){
        long sum=0;
        for(int i=0;i<arr.length;i++){
           sum += (long) Math.ceil((double) arr[i] / mid);

        }
        return sum;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int max=0;
        for(int i=0;i<n;i++){
            if(max<piles[i]){
                max=piles[i];
            }
        }
        int i=1;
        int j=max;
        int ans=0;
        while(i<=j){
            int mid=i+(j-i)/2;
            long a=time(piles,mid);
            if(a<=(long)h){
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