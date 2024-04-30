import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        if (n < 2) return false;

        Map<Integer, Integer> remainderIndexMap = new HashMap<>();
        remainderIndexMap.put(0, -1);

        int runningSum = 0;
        for (int i = 0; i < n; i++) {
            runningSum += nums[i];
            if (k != 0)
                runningSum %= k;

            if (remainderIndexMap.containsKey(runningSum)) {
                int prevIndex = remainderIndexMap.get(runningSum);
                if (i - prevIndex > 1)
                    return true;
            } else {
                remainderIndexMap.put(runningSum, i);
            }
        }
        return false;
    }
}
