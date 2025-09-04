class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> h = new HashSet<>();
        int l = 0, r = 0, max = 0;

        while (r < s.length()) {
            if (!h.contains(s.charAt(r))) {
                h.add(s.charAt(r));
                max = Math.max(max, r - l + 1);
                r++;
            } else {
                h.remove(s.charAt(l));
                l++;
            }
        }

        return max;
    }
}
