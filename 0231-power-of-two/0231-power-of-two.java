class Solution {

    private int pow(int num){
        int p=1;
        for(int i=1;i<=num;i++){
           p*=2;
        }
        return p;
    }

    public boolean isPowerOfTwo(int n) {
        if(n==1 || n==2){
            return true;
        }
        int i=0;
        int j=31;
        while(i<=j){
            int mid=i+(j-i)/2;
            int ans=pow(mid);
            if(ans==n){
                return true;
            }
            else if(ans<n){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return false;
    }
}