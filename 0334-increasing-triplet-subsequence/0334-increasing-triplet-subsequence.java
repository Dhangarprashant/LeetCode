class Solution {
    public boolean increasingTriplet(int[] nums) {
        int left=Integer.MAX_VALUE;
        int mid=Integer.MAX_VALUE;
        
        for(int i=0;i<nums.length;i++){
            int right=nums[i];
            if(right>mid){
                return true;
            }else if(right>left && right<mid){
                mid=right;
            }else if(right<left){
                left=right;
            }
        }
        return false;
    }
}