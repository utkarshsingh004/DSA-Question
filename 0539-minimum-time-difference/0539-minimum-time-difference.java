class Solution {
    public int findMinDifference(List<String> timePoints) {
        int n = timePoints.size();
        int[] minutes = new int[n]; // store times as integers instead of strings

        for (int i = 0; i < n; i++) {
            String a = timePoints.get(i);
            int j = 0;
            int min = 0;
            while (j < a.length()) {
                int num = 0;
                while (j < a.length() && Character.isDigit(a.charAt(j))) {
                    num = num * 10 + (a.charAt(j) - '0');
                    j++;
                }
                if (j < a.length() && a.charAt(j) == ':') {
                    min += num;  // add hours
                    min = min * 60; // convert to minutes
                    j++;
                } else {
                    min += num; // add minutes
                }
            }
            minutes[i] = min; // store as integer instead of String
        }

        Arrays.sort(minutes); // sort integer minutes

        int ans = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            ans = Math.min(ans, minutes[i] - minutes[i - 1]);
        }

        // handle circular difference (midnight wrap)
        ans = Math.min(ans, 1440 - (minutes[n - 1] - minutes[0]));

        return ans;
    }
}
