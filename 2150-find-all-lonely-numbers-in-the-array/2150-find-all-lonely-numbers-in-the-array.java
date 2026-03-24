import java.util.*;

class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for (int num : freqMap.keySet()) {
            if (freqMap.get(num) == 1 && 
                !freqMap.containsKey(num - 1) && 
                !freqMap.containsKey(num + 1)) {
                
                res.add(num);
            }
        }

        return res;
    }
}