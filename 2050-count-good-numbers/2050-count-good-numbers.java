class Solution {
    private long pow(long p, long q){
        if(q==0) return 1;
        long a=pow(p,q/2);
        if(q%2==1){
            return (a*a*p)%(1000000000+7);
        }
        return( a*a)%(1000000000+7);
    }
    public int countGoodNumbers(long n) {
        long n1=n/2;
        if(n%2==1){
            n=n/2+1;
            n1=n-1;
        }
        else n=n/2;
        long a=pow(5,n);
        long b=pow(4,n1);
        long ans=(a*b)%(1000000000+7);
        return (int)ans;
    }
}