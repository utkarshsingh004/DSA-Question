class Solution {

    private int happy(int n){
        int sum=0;
        while(n>0){
            int a=n%10;
            a=a*a;
            sum+=a;
            n=n/10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        HashSet<Integer> h = new HashSet<>();
        if(n==1) return true;
        // if(n<10) return false;
        int a=n;
        while(a!=1){
            if(h.contains(a)){
                return false;
            }
            int ans=happy(a);
            h.add(a);
            a=ans;
        }
        return true;
    }
}