class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        int lsum=0;
        int rsum=sum;
        for(int i=0;i<nums.length;i++){
            rsum=rsum-nums[i];
            if(rsum==lsum){
                return i;
            }
            lsum=lsum+nums[i];
        }
        return -1;
    }
}