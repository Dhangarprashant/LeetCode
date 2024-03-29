class Solution {
    public int longestSubarray(int[] nums) {
        int ans=0;
        int i=0;
        int j=-1;
        int count=0;
        while(i<nums.length){
            //Acquire
            
            if(nums[i]==1){
                i++;
            }else{
                i++;
                count++;
            }
            //If invalid
            while(count>1 && j<i){
                j++;
                if(nums[j]==0){
                    count--;
                }
            }
            ans=Math.max(ans,i-j-1);
        }
        return ans-1;
    }
}