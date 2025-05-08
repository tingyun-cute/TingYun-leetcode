package hash;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> tmpMap = new HashMap<String, List<String>>();
        for (String str : strs) {
            char[] array = str.toCharArray();
            Arrays.sort(array);
            String key = new String(array);
            List<String> val = tmpMap.getOrDefault(key, new ArrayList<String>());
            val.add(str);
            tmpMap.put(key, val);
        }
        return new ArrayList<List<String>>(tmpMap.values());
    }
}
