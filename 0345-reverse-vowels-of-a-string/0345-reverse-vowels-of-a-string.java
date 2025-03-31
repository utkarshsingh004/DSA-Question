class Solution {
    public String reverseVowels(String s) {
        StringBuilder st = new StringBuilder(s);
        int i = 0, j = s.length() - 1;

        while (i < j) {
            while (i < j && !isVowel(st.charAt(i))) {
                i++;
            }
            while (i < j && !isVowel(st.charAt(j))) {
                j--;
            }
            // Swap vowels
            char temp = st.charAt(i);
            st.setCharAt(i, st.charAt(j));
            st.setCharAt(j, temp);
            
            i++;
            j--;
        }
        return st.toString();
    }

    private boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
