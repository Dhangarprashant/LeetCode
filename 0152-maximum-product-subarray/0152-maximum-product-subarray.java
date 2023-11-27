class Solution {
    public int maxProduct(int[] nums) {
        int ans=Integer.MIN_VALUE;
        int currentproduct=1;
        for(int i=0;i<nums.length;i++){
            currentproduct=currentproduct*nums[i];
            ans=Math.max(currentproduct,ans);
            if(currentproduct==0){
                currentproduct=1;
            }
        }
        currentproduct=1;
        for(int i=nums.length-1;i>=0;i--){
            currentproduct=currentproduct*nums[i];
            ans=Math.max(currentproduct,ans);
            if(currentproduct==0){
                currentproduct=1;
            }
        }
        return ans;
    }
}