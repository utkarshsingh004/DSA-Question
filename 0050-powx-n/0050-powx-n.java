class Solution {
    private double pow(double x, int n){
        if(n==0) return 1;
        double p=pow(x,n/2);
        if(n%2==0) return p*p;
        else return p*p*x;
    }
    public double myPow(double x, int n) {
        double ans=pow(x,n);
        if(n<0){
            return (double)1/ans;
        }
        return ans;
    }
}