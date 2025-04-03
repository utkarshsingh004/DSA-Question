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
       char[] result = new char[st.size()];
        int i = result.length - 1;
        
        while (!st.isEmpty()) {
            result[i--] = st.pop();
        }
        
        return new String(result);
    }
}