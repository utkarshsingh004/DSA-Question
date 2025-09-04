class Solution {
    public String reverseWords(String s) {
        String[] S= s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = S.length-1 ; i >= 0; i--) {
            if (!S[i].equals("")){
                sb.append(S[i]).append(" ");
            }
        }
        return sb.toString().trim();
    }
}