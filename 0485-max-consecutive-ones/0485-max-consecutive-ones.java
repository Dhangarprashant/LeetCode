class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int n = nums.length;
        int ans = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            int j= i;
            while(j<n && nums[j]==1){
                j++;
            }
            ans = Math.max(ans, j-i+1);
            i=j;
        }
        return ans-1;
        
    }
}