class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> res = new ArrayList<>();
        helper(num, target, 0, 0, 0, "", res);
        return res;
    }

    private void helper(String num, int target, int idx, long currVal, long lastOperand, String expr, List<String> res) {
        if (idx == num.length()) {
            if (currVal == target) {
                res.add(expr);
            }
            return;
        }

        for (int i = idx; i < num.length(); i++) {
            // Avoid numbers with leading zero
            if (i != idx && num.charAt(idx) == '0') break;

            String part = num.substring(idx, i + 1);
            long currNum = Long.parseLong(part);

            if (idx == 0) {
                // First number (no operator before it)
                helper(num, target, i + 1, currNum, currNum, part, res);
            } else {
                helper(num, target, i + 1, currVal + currNum, currNum, expr + "+" + part, res);
                helper(num, target, i + 1, currVal - currNum, -currNum, expr + "-" + part, res);
                helper(num, target, i + 1, currVal - lastOperand + lastOperand * currNum,
                       lastOperand * currNum, expr + "*" + part, res);
            }
        }
    }
}
