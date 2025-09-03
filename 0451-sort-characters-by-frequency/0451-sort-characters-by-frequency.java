import java.util.*;

class Solution {
    class Pair {
        char c;
        int f;
        Pair(char c, int f) {
            this.c = c;
            this.f = f;
        }
        public String tooString() {
            return c + " -> " + f;
        }
    }

    public String frequencySort(String s) {
        // Step 1: Count frequencies
        HashMap<Character, Integer> h = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            h.put(c, h.getOrDefault(c, 0) + 1);
        }

        // Step 2: Store in a list of Pair
        ArrayList<Pair> arr = new ArrayList<>();
        for (char c : h.keySet()) {
            arr.add(new Pair(c, h.get(c)));
        }

        // Step 3: Sort by frequency (descending)
        arr.sort((a, b) -> b.f - a.f);

        // Step 4: Build the result string
        StringBuilder sb = new StringBuilder();
        for (Pair p : arr) {
            for (int i = 0; i < p.f; i++) {
                sb.append(p.c);
            }
        }

        return sb.toString();
    }
}
