;

var twoSum = function(nums, target) {
    let ans = [-1, -1];
    let map = new Map();
    for (let i = 0; i < nums.length; i++) {
        let value = nums[i];
        let check = target - value;
        if (map.has(check)) {
            ans[0] = map.get(check);
            ans[1] = i;
        } else {
            map.set(nums[i], i);
        }
    }
    return ans;
};
