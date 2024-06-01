/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let maxProfit=0;
    var sofar=prices[0];
    for(let i=0;i<prices.length;i++){
        sofar=Math.min(sofar,prices[i]);
        let profit=prices[i]-sofar;
        maxProfit=Math.max(maxProfit,profit);
    }
    return maxProfit;
};