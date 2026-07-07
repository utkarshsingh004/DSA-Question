class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        long p=1;
        long num=0;
        while(n>0){
            if(n%10==0){
                n=n/10;
                continue;
            }
            sum+=n%10;
            num+=n%10*p;
            p*=10;
            n=n/10;
        }
        return sum*num;
    }
}