import java.util.HashMap;

class Solution {
    public int findMaxK(int[] nums) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int maxK = -1;
        for (int num : nums) {
            if (num > 0 && frequencyMap.containsKey(-num)) { 
                maxK = Math.max(maxK, num);
            }
        }

        return maxK;
    }
}
