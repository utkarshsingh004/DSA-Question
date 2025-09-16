
class Solution {
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public List<Integer> replaceNonCoprimes(int[] nums) {
        Stack<Integer> st = new Stack<>();
        st.push(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            int cur = nums[i];
            while (!st.isEmpty()) {
                int top = st.peek();
                int h = gcd(top, cur);
                if (h == 1) break; // coprime → stop merging
                cur = (top / h) * cur; // lcm
                st.pop();             // remove old top and continue merging
            }
            st.push(cur);
        }

        return new ArrayList<>(st);
    }
}
