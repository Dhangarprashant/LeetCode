class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> freqMap = new HashMap<>();
        
        for (int num : nums) {
            freqMap.put(sum, freqMap.getOrDefault(sum, 0) + 1);
            sum += num;
            count += freqMap.getOrDefault(sum - goal, 0);
        }
        
        return count;
    }
}
