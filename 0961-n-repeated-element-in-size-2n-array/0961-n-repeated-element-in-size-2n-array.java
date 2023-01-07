class Solution {
    public int repeatedNTimes(int[] nums) {
        int length=nums.length-1;
        Arrays.sort(nums);
        for(int i=0;i<length;i++){
            if(nums[i]==nums[i+1]){
               return nums[i];
            }
        }
        return 0;
    }
}