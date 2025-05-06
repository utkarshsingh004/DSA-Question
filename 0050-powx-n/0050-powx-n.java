class Solution {

    public double power(double x, int n){
         int idx=n;
        if(n==0){
            return 1;
        }
        double res = power(x,n/2);
        if(n%2==0){
            return res*res;
        }
        else{
            return res*res*x;
        }
    }

    public double myPow(double x, int n) {
       double ans= power(x,n);
       if(n<0){
        return 1/ans;
       }
       return ans;
    }
}