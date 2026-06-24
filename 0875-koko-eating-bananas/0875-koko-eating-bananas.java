class Solution {
    private long helper(int arr[], int m){
        int count=0;
        for(int i=0;i<arr.length;i++){
           count += (long) (arr[i] + m - 1) / m;
        }
        return count;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int min=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,piles[i]);
        }
        int idx=-1;
        while(min<=max){
            int mid=min+(max-min)/2;
            long a=helper(piles,mid);
            if(a==h){
                idx=mid;
                max=mid-1;
            }
            else if(a>h){
                min=mid+1;
            }
            else max=mid-1;
        }
        return idx;
    }
}