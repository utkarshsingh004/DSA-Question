class Solution {

    private double pow(double x, long n){
         if(n<=0){
            return 1.0;
        }
        double a = pow(x,n/2);
        if(n%2==0){
            return a*a;
        }
        else{
            return a*a*x;
        }
    }

    public double myPow(double x, int n) {
       long N = n; // Convert to long to safely handle Integer.MIN_VALUE
        if (N < 0) {
           x = 1 / x;
           N = -N;
        }
       double res= pow(x,N);
       return res;
       
    }
}