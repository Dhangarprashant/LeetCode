class Solution {
    public int smallestRangeI(int[] nums, int k) {
        
         Arrays.sort(nums);
        int range = nums[ nums.length-1] - nums[0];

        return  (range - k*2) > 0 ? (range - k*2) : 0;
    }
}