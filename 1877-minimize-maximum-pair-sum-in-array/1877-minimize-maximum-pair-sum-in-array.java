class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        int ans=Integer.MIN_VALUE;
        while(left<=right){
            int sum=nums[left]+nums[right];
            if(sum>ans){
                ans=sum;
            }
            left++;
            right--;
        }
        return ans;
    }
}