import java.util.Stack;

class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);  
            
            if (ch == '*') {
                if (!st.isEmpty()) {
                    st.pop();

                }
            } else {
                st.push(ch);  
            }
        }
       String ans="";
        while(!st.empty()){
            ans+=st.peek();
            st.pop();
        }
       String result="";
       for(int i=ans.length()-1;i>=0;i--){
        result+=ans.charAt(i);
       }
        
        return result;
    }
}
