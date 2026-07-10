class Solution {
    public int trap(int[] h) {
        int n=h.length;
        int sum=0;
        int left[] = new int[n];
        int right[] = new int[n];
        int m=h[n-1];
        int m2=h[0];
        for(int i=n-1;i>=0;i--){
            if(h[i]>m){
                m=h[i];
            }
            if(h[n-i-1]>m2){
                m2=h[n-1-i];
            }
            left[n-i-1]=m2;
            right[i]=m;
        }
        for(int i=0;i<n;i++){
           sum+=Math.min(left[i],right[i])-h[i];
        }
        return sum;
    }
} 
