class Solution {
    private int total(int arr[], int s){
     int count=0;
     for(int i=0;i<arr.length;i++){
        count+=(arr[i]+s-1)/s;
     }
     return count;
   }
    public int smallestDivisor(int[] piles, int h) {
        int n=piles.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
          if(max<piles[i]){
            max=piles[i];
          }
        }
        int i=1;
        int j=max;
        while(i<=j){
            int mid=i+(j-i)/2;
            int ans=total(piles,mid);
            if(ans<=h){
                j=mid-1;;
            }
            else{
                i=mid+1;
            }
        }
      return i;
    }
}