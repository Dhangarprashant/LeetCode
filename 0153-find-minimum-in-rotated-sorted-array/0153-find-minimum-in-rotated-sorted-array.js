
var findMin = function(nums) {
    let max=Number.POSITIVE_INFINITY;
    for(let i=0;i<nums.length;i++){
        max=Math.min(max,nums[i]);
    }
    return max;
};