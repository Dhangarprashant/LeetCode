class Solution {
    public int rob(int[] nums) {
        
        if(nums.length==1){
            return nums[0];
        }
        
        int FirstSkipHouse[]=new int[nums.length];
        int LastSkipHouse[]=new int[nums.length];
        for(int i=0;i<nums.length-1;i++){
            FirstSkipHouse[i]=nums[i];
            LastSkipHouse[i]=nums[i+1];
        }
        
        int skippingLastHouse=robber(LastSkipHouse);
        int skippingFirstHouse=robber(FirstSkipHouse);
        return Math.max(skippingLastHouse,skippingFirstHouse);
    }
    public static int robber(int[] arr){
        
        int dp[]=new int[arr.length];
        dp[0]=arr[0];
        dp[1]=Math.max(arr[0],arr[1]);
        for(int i=2;i<arr.length;i++){
            dp[i]=Math.max(dp[i-2]+arr[i],dp[i-1]);
        }
        return dp[arr.length-1];
    }
}
