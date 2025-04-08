package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Partition {

    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        if (s == null || s.length() == 0) {
            return res;
        }
        backtrack(s, 0, res, new ArrayList<>());
        return res;
    }

    private void backtrack(String s, int start, List<List<String>> res, List<String> tmp) {
        if (start == s.length()) {
            res.add(new ArrayList<>(tmp));
            return;
        }

        for (int i = start; i < s.length(); i++) {
            String substring = s.substring(start, i + 1);
            if (isPalindrome(substring)) {
                tmp.add(substring);
                backtrack(s, i + 1, res, tmp);
                tmp.remove(tmp.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
