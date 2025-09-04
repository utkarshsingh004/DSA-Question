class Solution {
    public int maxDepth(String s) {
        int n=s.length();
        int max=0;
        Stack<Character> st = new Stack<>();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            max=Math.max(max,st.size());
            if(c=='('){
                st.push(c);
            }
            else if(c==')'){
                if(st.size()!=0){
                    st.pop();
                }
            }
        }
        return max;
    }
}