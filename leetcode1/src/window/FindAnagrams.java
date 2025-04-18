package window;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (s == null || p == null || s.length() < p.length()) {
            return res;
        }
        List<Character> pList = new ArrayList<>();
        for (char c : p.toCharArray()) {
            pList.add(c);
        }
        Collections.sort(pList); // 对 p 进行排序

        List<Character> tmp = new ArrayList<>();
        int left = 0;
        int right = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            tmp.add(c);
            right++;
            if (tmp.size() == p.length()) {
                List<Character> sortedTmp = new ArrayList<>(tmp);
                Collections.sort(sortedTmp); // 对 tmp 进行排序
                if (sortedTmp.equals(pList)) { // 比较排序后的列表
                    res.add(left);
                }
                tmp.remove(0); // 移除最左边的字符
                left++;
            }
        }
        return res;
    }
}
