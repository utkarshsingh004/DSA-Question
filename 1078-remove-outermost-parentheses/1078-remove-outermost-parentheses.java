class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        String ans="";
        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='('){
                st.push(i);
            }
            else{
                int t=st.pop();
                if(st.isEmpty()){
                    sb.setCharAt(t,'*');
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