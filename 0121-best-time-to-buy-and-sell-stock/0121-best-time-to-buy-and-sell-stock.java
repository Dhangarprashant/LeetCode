// class Solution {
//     public int maxProfit(int[] prices) {
//         int max=0;
//         for(int i=0;i<prices.length;i++){
//             for(int j=i+1;j<prices.length;j++){
//                 if(prices[j]>prices[i]){  
//                    int diff=prices[j]-prices[i];
//                     if(diff>max)
//                         max=diff;
//                 }
//             }
//         }
//         return max;
//     }
// }



class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int sofar=prices[0];
        for(int i=0;i<prices.length;i++){
            sofar=Math.min(prices[i],sofar);
            int profit=prices[i]-sofar;
            maxprofit=Math.max(maxprofit,profit);
        }
        return maxprofit;
    }
}


