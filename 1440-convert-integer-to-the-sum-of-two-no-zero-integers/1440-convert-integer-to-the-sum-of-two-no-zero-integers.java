class Solution {
    private boolean check(int n){
        while(n>0){
            if(n%10==0) return false;
            n=n/10;
        }
        return true;
    }
    public int[] getNoZeroIntegers(int n) {
        int arr[] = new int[2];
        for(int i=1;i<n;i++){
            arr[0]=n-i;
            arr[1]=i;
            if(check(arr[0]) && check(arr[1])) break;
        }
        return arr;
    }
}