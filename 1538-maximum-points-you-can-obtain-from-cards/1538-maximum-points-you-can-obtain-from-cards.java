class Solution {
    public int maxScore(int[] arr, int k) {
        int n=arr.length;
        int pref[] = new int[n];
        int suff[] = new int[n];
        pref[0]=arr[0];
        suff[n-1]=arr[n-1];
        int max=0;
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]+arr[i];
            suff[n-1-i]=suff[n-i]+arr[n-1-i];
        }
        max=Math.max(pref[k-1],suff[n-k]);
        System.out.print(max);
        int i=k-2;
        int j=n-1;
        while(i>=0){
            if(j<i) break;
            int sum=pref[i]+suff[j];
            max=Math.max(max,sum);
            j--;
            i--;
        }
        return max;
    }
}