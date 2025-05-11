class Solution {
    public List<String> letterCombinations(String digits) {
    List<String> ans = new ArrayList<>();
    if (digits == null || digits.length() == 0) return ans;

    String[] kp = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    backtrack(digits, 0, "", kp, ans);
    return ans;
}

private void backtrack(String digits, int index, String res, String[] kp, List<String> ans) {
    if (index == digits.length()) {
        ans.add(res);
        return;
    }

    String choices = kp[digits.charAt(index) - '0'];
    for (int i = 0; i < choices.length(); i++) {
        backtrack(digits, index + 1, res + choices.charAt(i), kp, ans);
    }
}

}