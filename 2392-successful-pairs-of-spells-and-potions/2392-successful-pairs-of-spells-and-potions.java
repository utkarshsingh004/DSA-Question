import java.util.*;

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;

        // store spell with its original index
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = spells[i]; // spell value
            arr[i][1] = i;         // original index
        }

        // sort spells and potions
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        Arrays.sort(potions);

        int[] ans = new int[n];
        int j = m - 1;

        // iterate spells in ascending order
        for (int i = 0; i < n; i++) {
            int spell = arr[i][0];
            // move potion pointer from right to left until product is large enough
            while (j >= 0 && (long)spell * potions[j] >= success) {
                j--;
            }
            // all potions after j are successful
            ans[arr[i][1]] = m - (j + 1);
        }

        return ans;
    }
}
