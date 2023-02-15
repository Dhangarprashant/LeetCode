class Solution {
    public int maximumCount(int[] nums) {
        int length=nums.length;
        int positive=0;
        int negative=0;
        Arrays.sort(nums);
        for(int i=0;i<length;i++){
            if(nums[i]<0){
                positive++;
            }else if(nums[i]>0){
                negative++;
            }
        }
        return Math.max(positive,negative);
    }
}