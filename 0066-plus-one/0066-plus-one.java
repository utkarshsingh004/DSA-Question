class Solution {
    public int[] plusOne(int[] d) {
        int n=d.length;
        int c=1;
        for(int i=n-1;i>=0;i--){
            int sum=d[i]+c;
            d[i]=sum%10;
            c=sum/10;
        }
        if(c>0){
            int arr[]=new int[n+1];
            arr[0]=c;
            for(int i=1;i<arr.length;i++){
                arr[i]=d[i-1];
            }
            return arr;
        }
        return d;
    }
}