import java.util.Arrays;

class Solution {
    public int removeCoveredIntervals(int[][] intervals) {

        // Sort:
        // 1. Start in ascending order.
        // 2. If starts are same, end in descending order.
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(b[1], a[1]);
            }
            return Integer.compare(a[0], b[0]);
        });

        int count = 1;
        int maxEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][1] > maxEnd) {
                count++;
                maxEnd = intervals[i][1];
            }
            // else: current interval is covered
        }

        return count;
    }
}