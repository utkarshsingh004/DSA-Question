class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
      int empty=0;
      int rem=0;
      while(numBottles>0){
        int a=numBottles+rem;
        empty+=numBottles;
        numBottles=(numBottles+rem)/numExchange;
        rem=a%numExchange;
        System.out.printf("%d, %d \n",rem,numBottles);
      }  
      return empty;
    }
}