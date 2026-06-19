class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int p[]= new int[n+1];
        p[0]=0;
        int k=1;
        int max=p[0];
        for(int i=0;i<n;i++){
            p[k]=gain[i]+p[k-1];
            if(max<p[k]) max=p[k];
            k++;
        }
        return max;
    }
}