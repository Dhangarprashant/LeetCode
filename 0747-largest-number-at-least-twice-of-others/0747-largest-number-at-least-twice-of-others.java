class Solution {
    public int dominantIndex(int[] nums) {
        int max = -1,mi=-1;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
                mi=i;
            }
        }
        for(int i:nums){
            if(max<i*2 && i!=max){
                return -1;
            }
        }
        return mi;
    }
}