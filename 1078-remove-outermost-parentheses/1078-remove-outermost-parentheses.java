class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        String ans="";
        int bucket=0;
        for(int i=0;i<n;i++){
           if(bucket==0){
            bucket++;
            continue;
           }
           if(s.charAt(i)=='('){
            bucket++;
           }
           else{
            bucket--;
            if(bucket==0){
               continue;
            }
           }
           ans+=s.charAt(i);

        }
        
        return ans;
    }
}