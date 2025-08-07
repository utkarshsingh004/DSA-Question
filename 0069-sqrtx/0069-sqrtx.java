class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1){
            return x;
        }
        long i=0;
        long j=x;
        long ans=0;
        while(i<=j){
            long mid=i+(j-i)/2;
            long mul=mid*mid;
            if(mul<=x){
                ans=mid;
                i=1+mid;
            }
            else{
                j=mid-1;
            }
        }
        return (int)ans;
    }
}