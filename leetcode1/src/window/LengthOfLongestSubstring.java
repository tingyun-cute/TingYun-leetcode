package window;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    int maxLen = 0;
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        Set<Character> set = new HashSet<>();
        helper(s, 0, set);
        return maxLen;
    }

    private void helper(String s, int start, Set<Character> set) {
        if (start == s.length()) {
            maxLen = Math.max(maxLen, set.size());
            return;
        }
        for (int i = start; i < s.length(); i++) {
            char c = s.charAt(i);
            if (set.contains(c)) {
                break; // 如果字符重复，停止当前递归分支
            }
            set.add(c);
            maxLen = Math.max(maxLen, set.size());
            helper(s, i + 1, set);
            set.remove(c); // 回溯
        }
    }

    public class LengthOfLongestSubstring1 {
        public int lengthOfLongestSubstring(String s) {
            if (s == null || s.length() == 0) {
                return 0;
            }
            Set<Character> set = new HashSet<>();
            int left = 0;
            int right = 0;
            int maxLen = 0;
            while (right < s.length()) {
                char c = s.charAt(right);
                if (!set.contains(c)) {
                    set.add(c);
                    maxLen = Math.max(maxLen, right - left + 1);
                    right++;
                } else {
                    set.remove(s.charAt(left));
                    left++;
                }
            }
            return maxLen;
        }
    }

}
