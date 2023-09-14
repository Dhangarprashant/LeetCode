class Solution {
    public int partitionDisjoint(int[] nums) {
        int max = nums[0];
        int leftMax = nums[0];
        int partitionIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            if (nums[i] < leftMax) {
                leftMax = max; 
                partitionIndex = i; 
            }
        }
        return partitionIndex + 1; 
    }
}
