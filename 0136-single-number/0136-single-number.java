class Solution {
    public int singleNumber(int[] nums) {
        int length=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<length-1;){
            if(nums[i]==nums[i+1]){
                i+=2;
            }else{
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}