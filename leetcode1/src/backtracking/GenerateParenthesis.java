package backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        if (n <= 0) {
            return null;
        }
        List<String> res = new ArrayList<>();
        helper(n, n, "", res);
        return res;
    }

    public void helper(int left, int right, String s, List<String> res) {
        if (left == 0 && right == 0) {
            res.add(s);
            return;
        }
        if (left > right || left < 0 || right < 0) {
            return;
        }
        helper(left - 1, right, s + "(", res);
        helper(left, right - 1, s + ")", res);
    }
}
