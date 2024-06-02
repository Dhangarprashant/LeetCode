/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    if (x < 0) {
        return false;
    }
    let temp=0;
    let num=x;
    while(x!=0){
        let rem=x%10;
        temp=temp*10+rem;
        x=Math.floor(x/10);
    }
    if(num==temp){
        return true;
    }else{
        return false;
    }
};