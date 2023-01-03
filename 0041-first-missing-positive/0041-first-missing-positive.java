class Solution {
    public int firstMissingPositive(int[] nums) {
        int length=nums.length;
        Arrays.sort(nums);
        int ans=1;
        for(int i=0;i<length;i++){
            if(nums[i]==ans){
                ans++;
            }
        }
        return ans;
    }
}