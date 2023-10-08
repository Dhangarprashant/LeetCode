class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int start=0;
        int end=0;
        int ans=0;
        int prevc=0;
        while(end<nums.length){
            if(left<=nums[end] && nums[end]<=right){
                prevc=end-start+1;
                ans=ans+prevc;
            }else if(nums[end]<left){
                ans=ans+prevc;
            }else{
                start=end+1;
                prevc=0;
            }
            end++;
        }
        return ans;
    }
}