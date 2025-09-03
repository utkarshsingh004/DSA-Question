class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int balance = 0; // keeps track of depth

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (balance > 0) ans.append(c); // not outermost
                balance++;
            } else {
                balance--;
                if (balance > 0) ans.append(c); // not outermost
            }
        }

        return ans.toString();
    }
}
