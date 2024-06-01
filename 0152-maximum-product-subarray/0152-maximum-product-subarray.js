/**
 * @param {number[]} nums
 * @return {number}
 */
var maxProduct = function(nums) {
    if(nums==null || nums.length==0){
        return 0;
    }
    let maxProduct=nums[0];
    for(let i=0;i<nums.length;i++){
        let currentPro=1;
        for(let j=i;j<nums.length;j++){
            currentPro=currentPro*nums[j];
            if(currentPro>maxProduct){
                maxProduct=currentPro;
            }
        }
    }
    return maxProduct;
};