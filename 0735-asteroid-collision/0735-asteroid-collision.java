import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        
        for (int asteroid : asteroids) {
            // Process collisions
            while (!st.isEmpty() && asteroid < 0 && st.peek() > 0) {
                int top = st.peek();
                if (Math.abs(asteroid) > top) {
                    st.pop(); // The right-moving asteroid is destroyed, continue checking
                } else if (Math.abs(asteroid) == top) {
                    st.pop(); // Both asteroids destroy each other
                    asteroid = 0; // Mark asteroid as destroyed
                    break;
                } else {
                    asteroid = 0; // The left-moving asteroid is destroyed
                    break;
                }
            }
            // If asteroid is still alive, push it to stack
            if (asteroid != 0) {
                st.push(asteroid);
            }
        }

        // Convert stack to array
        int[] result = new int[st.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = st.pop();
        }

        return result;
    }
}
