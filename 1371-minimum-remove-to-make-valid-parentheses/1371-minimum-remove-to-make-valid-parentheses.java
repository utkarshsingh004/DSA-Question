import java.util.*;

class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>(); // Stack to store indices of '('
        StringBuilder sb = new StringBuilder(s);
        
        // Step 1: Identify invalid parentheses
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch == '(') {
                stack.push(i); // Store index of '('
            } else if (ch == ')') {
                if (!stack.isEmpty()) {
                    stack.pop(); // Valid match found
                } else {
                    sb.setCharAt(i, '*'); // Mark invalid ')'
                }
            }
        }
        
        // Step 2: Remove leftover '(' from the stack
        while (!stack.isEmpty()) {
            sb.setCharAt(stack.pop(), '*'); // Mark invalid '('
        }
        
        // Step 3: Build the final string, removing marked characters
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != '*') {
                result.append(sb.charAt(i));
            }
        }
        
        return result.toString();
    }
}
