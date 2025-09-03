class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        String ans="";
        int b=0;
        for(int i=0;i<n;i++){
          if(s.charAt(i)=='('){
            if(b!=0) ans+=s.charAt(i);
            b++;
          }
          else{
            b--;
            if(b!=0) ans+=s.charAt(i);
          }
        }
        
        return ans;
    }
}