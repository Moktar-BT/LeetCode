public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(n, 0, 0, new StringBuilder(), res);
        return res;
    }

    private void backtrack(int n, int openN, int closedN, StringBuilder current, List<String> res) {
        if (openN == n && closedN == n) {
            res.add(current.toString());
            return;
        }
        if (openN < n) {
            current.append("(");
            backtrack(n, openN + 1, closedN, current, res);
            current.deleteCharAt(current.length() - 1);
        }
        if (closedN < openN) {
            current.append(")");
            backtrack(n, openN, closedN + 1, current, res);
            current.deleteCharAt(current.length() - 1);
        }
    }
}