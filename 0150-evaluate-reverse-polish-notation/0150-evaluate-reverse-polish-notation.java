import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            String token = tokens[i];
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int v2 = st.pop();
                int v1 = st.pop();
                if (token.equals("+")) st.push(v1 + v2);
                if (token.equals("-")) st.push(v1 - v2);
                if (token.equals("*")) st.push(v1 * v2);
                if (token.equals("/")) st.push(v1 / v2);
            } else {
                st.push(Integer.parseInt(token));
            }
        }

        return st.peek();
    }
}
