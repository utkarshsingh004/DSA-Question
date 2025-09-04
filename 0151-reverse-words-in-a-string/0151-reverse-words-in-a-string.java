class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {
            // skip trailing spaces
            while (i >= 0 && s.charAt(i) == ' ') i--;

            if (i < 0) break;

            int j = i;
            // move to the beginning of the word
            while (i >= 0 && s.charAt(i) != ' ') i--;

            // append the word
            sb.append(s, i + 1, j + 1).append(" ");
        }

        // remove the last space if any
        if (sb.length() > 0) sb.setLength(sb.length() - 1);

        return sb.toString();
    }
}
