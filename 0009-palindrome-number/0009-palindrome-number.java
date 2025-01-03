class Solution {
    public boolean isPalindrome(int x) {
        int number=x;
        if(x>=0){
            int newNumber=0;
            while(x>0){
                newNumber=newNumber*10+x%10;
                x=x/10;
            }
            if(newNumber==number){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
}