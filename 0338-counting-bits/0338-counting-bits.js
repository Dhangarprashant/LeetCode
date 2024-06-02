
var countBits = function(n) {
    let ans = new Array(n + 1);
    for (let i = 0; i <= n; i++) {
        ans[i] = countingBits(i);
    }
    return ans;
};

var countingBits = function(n) {
    let count = 0;
    while (n > 0) {
        count += (n & 1);
        n >>= 1;
    }
    return count;
};
