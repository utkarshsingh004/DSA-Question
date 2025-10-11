import java.util.*;

class Solution {
    private long[] memo;
    private int[] unique;
    private int[] nxt;
    private long[] freq;
    private int m;

    public long maximumTotalDamage(int[] power) {
        Map<Integer, Long> count = new HashMap<>();
        for (int p : power) {
            count.put(p, count.getOrDefault(p, 0L) + 1L);
        }

        // build sorted unique array
        m = count.size();
        unique = new int[m];
        freq = new long[m];
        int idx = 0;
        for (int p : count.keySet()) {
            unique[idx] = p;
            freq[idx] = count.get(p);
            idx++;
        }
        Arrays.sort(unique);

        // but after sorting unique[], freq[] must match — better to build a list of pairs
        // Let me fix: use a list of pairs

        List<int[]> list = new ArrayList<>();  // each element: [powerValue, indexInMap]
        for (Map.Entry<Integer, Long> e : count.entrySet()) {
            list.add(new int[]{ e.getKey().intValue(), 0 });  // second is dummy
        }
        Collections.sort(list, Comparator.comparingInt(a -> a[0]));
        for (int i = 0; i < m; i++) {
            unique[i] = list.get(i)[0];
            freq[i] = count.get(unique[i]);
        }

        // build nxt[]
        nxt = new int[m];
        for (int i = 0; i < m; i++) {
            // find first j > i such that unique[j] > unique[i] + 2
            int target = unique[i] + 2;
            int lo = i + 1, hi = m;
            while (lo < hi) {
                int mid = lo + (hi - lo) / 2;
                if (unique[mid] > target) {
                    hi = mid;
                } else {
                    lo = mid + 1;
                }
            }
            nxt[i] = lo;
        }

        memo = new long[m + 1];
        Arrays.fill(memo, -1L);
        return dfs(0);
    }

    private long dfs(int i) {
        if (i >= m) return 0;
        if (memo[i] != -1L) return memo[i];

        // option 1: skip this damage
        long ans = dfs(i + 1);

        // option 2: take this damage
        long take = unique[i] * freq[i] + dfs(nxt[i]);
        ans = Math.max(ans, take);

        memo[i] = ans;
        return ans;
    }
}
