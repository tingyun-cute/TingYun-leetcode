package dump;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        Map<Integer, Integer> temp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            temp.put(nums[i], temp.getOrDefault(nums[i], 0) + 1);
        }
        List<Integer> list = temp.entrySet().stream()
                .sorted((a, b) -> b.getValue() - a.getValue())
                .map(Map.Entry::getKey)
                .limit(k)
                .collect(Collectors.toList());
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
