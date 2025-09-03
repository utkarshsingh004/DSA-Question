class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        StringBuilder ans= new StringBuilder();
        int b=0;
        for(int i=0;i<n;i++){
          if(s.charAt(i)=='('){
            if(b!=0) ans.append(s.charAt(i));
            b++;
          }
          else{
            b--;
            if(b!=0) ans.append(s.charAt(i));
          }
        }
        
        return ans.toString();
    }
}