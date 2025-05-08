package backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {
    public static Map<String, String> map = new HashMap<>();
    static {
        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6", "mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");
    }

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.length() == 0) {
            return res;
        }
        helper(digits, 0, res, new StringBuilder());
        return res;
    }

    public void helper(String digits, int index, List<String> res, StringBuilder sb) {
        if (index == digits.length()) {
            res.add(sb.toString());
            return;
        }
        for (char c : map.get(digits.charAt(index) + "").toCharArray()) {
            sb.append(c);
            helper(digits, index + 1, res, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
