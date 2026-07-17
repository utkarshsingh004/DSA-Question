class Solution {
    private int gcd(int e, int o){
        if(o==0) return e;
        return gcd(o,e%o);
    }
    public int gcdOfOddEvenSums(int n) {
        int e=n*(n+1);
        int o=n*n;
        return gcd(e,o);
    }
}