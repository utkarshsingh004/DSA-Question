class Solution {
    private long pow(long mid){
        long p=1;
        for(int i=0;i<mid;i++){
            p=p*4;
        }
        return p;
    }
    public boolean isPowerOfFour(int n) {
        long i=0;
        long j=31;
        while(i<=j){
            long mid=i+(j-i)/2;
            if(pow(mid)==n){
                return true;
            }
            else if(pow(mid)<n){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return  false;
    }
}