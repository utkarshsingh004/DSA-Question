class Solution {
    public int maxScore(int[] arr, int k) {
        int n=arr.length;
        int p=0;
        for(int i=0;i<k;i++){
            p+=arr[i];
        }
        System.out.print(p);
        int i=k-1;
        int j=n;
        int s=0;
        int sum=0;
        int max=0;
        while(i>=-1){
            if(i>j){
                break;
            }
            if(j==n){
                sum=p;
                // s=arr[j];
            }
            else if(i==-1){
                sum=s+arr[j];
            }
            else{
                s+=arr[j];
                System.out.print(s);
                p=p-arr[i+1];
                sum=p+s;
            }
            i--;
            j--;
            max=Math.max(max,sum);
        }
        return max;
    }
}