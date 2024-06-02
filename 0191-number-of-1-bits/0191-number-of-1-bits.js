/**
 * @param {number} n
 * @return {number}
 */
var hammingWeight = function(n) {
    let bits=n.toString(2);
    let count=0;
    for(let i=0;i<bits.length;i++){
        if(bits.charAt(i)=='1'){
            count++;
        }
    }
    return count;
};