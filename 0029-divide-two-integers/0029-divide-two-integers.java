// class Solution 
// {
//     public int divide(int dividend, int divisor) 
//     {
//         if(dividend==-2147483648 && divisor==-1){
//             return (2147483648);
//         }
//         int prashant=dividend/divisor;
//         return prashant;
//     }
// }


class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == -2147483648 && divisor == -1) {
        return (2147483647);
    }
        int a = dividend/divisor;
        return a;
    }
}