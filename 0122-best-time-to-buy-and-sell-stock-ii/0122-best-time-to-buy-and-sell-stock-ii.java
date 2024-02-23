class Solution {
    public int maxProfit(int[] price) {
        int n=price.length;
        int dp[][]=new int[n][2];
         for (int i = 0; i < n; i++) {
            dp[i][0] = -1;
            dp[i][1] = -1;
        }
        return helper(0,1,price,n,dp);
    }
    public int helper(int index,int buy,int price[],int n,int dp[][]){
        if(index==n){
            return 0;
        }
        if(dp[index][buy]!=-1){
            return dp[index][buy];
        }
        int profit=0;
        if(buy==1){
            profit=Math.max(-price[index]+helper(index+1,0,price,n,dp),0+helper(index+1,1,price,n,dp));
        }else{
            profit=Math.max(price[index]+helper(index+1,1,price,n,dp),0+helper(index+1,0,price,n,dp));
        }
        dp[index][buy]=profit;
        return profit;
    }
}