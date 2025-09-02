class Solution {
    public int mySqrt(int x) {
        long i=0;
        long j=x;
        int ans=0;
        while(i<=j){
            long mid=i+(j-i)/2;
            long mul=(long)(mid*mid);
            if(mul==(long)x){
                return (int)mid;
            }
            else if(mul<(long)x){
                ans=(int)mid;
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return ans;
    }
}