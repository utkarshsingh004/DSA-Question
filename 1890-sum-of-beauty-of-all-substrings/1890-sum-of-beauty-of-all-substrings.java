class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int total = 0;

        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            int currentMax = 0; // track max incrementally

            for (int j = i; j < n; j++) {
                int idx = s.charAt(j) - 'a';
                freq[idx]++;

                // update max in O(1)
                currentMax = Math.max(currentMax, freq[idx]);

                // compute min by scanning (still O(26) = O(1))
                int currentMin = Integer.MAX_VALUE;
                for (int k = 0; k < 26; k++) {
                    if (freq[k] == 0) continue;
                    currentMin = Math.min(currentMin, freq[k]);
                }

                total += (currentMax - currentMin);
            }
        }

        return total;
    }
}
