
var productExceptSelf = function(nums) {
    let left=new Array(nums.length);
    let right=new Array(nums.length);
    left[0]=1;
    right[nums.length-1]=1;
    for(let i=1;i<nums.length;i++){
        left[i]=left[i-1]*nums[i-1];
    }
    for(let i=nums.length-2;i>=0;i--){
        right[i]=right[i+1]*nums[i+1];
    }
    let ans=new Array(nums.length);
    for(let k=0;k<nums.length;k++){
        ans[k]=left[k]*right[k];
    }
    return ans;
};
