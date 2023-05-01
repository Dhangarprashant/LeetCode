class Solution {
    public int minimumDifference(int[] nums, int k) {
        int min=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=k-1;i<nums.length;i++){
             min=Math.min(min,nums[i]-nums[i-k+1]);
        }
        return min;
    }
}