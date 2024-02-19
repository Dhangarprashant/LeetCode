// class Solution {
//     public boolean isPowerOfTwo(int n) {
//         for(int i=0;i<n;i++){
//             int poweer=(int)Math.pow(2,i);
//             if(poweer==n){
//                 return true;
//             }
//         }
//         return false;
//     }
// }

class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}