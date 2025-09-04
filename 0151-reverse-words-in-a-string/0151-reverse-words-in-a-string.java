class Solution {
    public String reverseWords(String s) {
        // split by one or more spaces
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) sb.append(" "); // only add space between words
        }

        return sb.toString();
    }
}
