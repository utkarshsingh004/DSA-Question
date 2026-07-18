class Solution {
    public boolean isPerfectSquare(int num) {
      long i=1;
      long j=num;
      while(i<=j){
        long mid=i+(j-i)/2;
        long s=(mid*mid);
        if(s==num) return true;
        else if(s<num) i=mid+1;
        else j=mid-1;
      } 
      return false; 
    }
}