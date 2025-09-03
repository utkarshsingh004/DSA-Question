class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        String ans="";
        StringBuilder sb = new StringBuilder(s);
        int bucket=0;
        for(int i=0;i<n;i++){
           if(bucket==0){
            sb.setCharAt(i,'*');
           }
           if(s.charAt(i)=='('){
            bucket++;
           }
           else{
            bucket--;
            if(bucket==0){
               sb.setCharAt(i,'*');
            }
           }

        }
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)!='*'){
                ans+=sb.charAt(i);
            }
        }
        return ans;
    }
}