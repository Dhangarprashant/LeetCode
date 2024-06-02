/**
 * @param {string} s
 * @return {number}
 */
var countSubstrings = function(s) {
    let count=0;
    for(let i=0;i<s.length;i++){
        for(let j=i;j<s.length;j++){
            if(isPalindromic(s.substring(i,j+1))){
                count++;
            }
        }
    }
    return count;
};
var isPalindromic=function(s){
    let left=0;
    let right=s.length-1
    while(left<=right){
        if(s.charAt(left)!=s.charAt(right)){
            return false;
        }
        left++;
        right--;
    }
    return true;
};