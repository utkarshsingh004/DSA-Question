class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0; // child index
        int j = 0; // cookie index
        int count = 0;
        
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) { // cookie can satisfy child
                count++;
                i++;
                j++;
            } else {
                j++; // try next bigger cookie
            }
        }
        
        return count;
    }
}
