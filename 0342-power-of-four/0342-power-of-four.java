class Solution {
    private int num(int n){
        int count=0;
        while(n>0){
            if(n%2==0) count++;;
            n=n>>1;
        }
        return count;
    }
    public boolean isPowerOfFour(int n) {
        if(n<=0) return false;
        if(n==1) return true;
        int a=n&(n-1);
        int count=num(n);
        if(a==0){
            if(count%2==0){
                return true;
            }
        }
        return false;
    }
}