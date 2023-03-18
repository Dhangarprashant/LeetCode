// class Solution {
//     public int getSum(int a, int b) {
//         int count=0;
//         int c=0;
//         int max=Math.max(a,b);
//         int min=Math.min(a,b);
//         while(c<=max){
//             count++;
//         }
//         while(c<=min){
//                 count++;
//             }
//         return count;
//     }
// }

// class Solution {
//     public int getSum(int a, int b) {
//         int max=Math.max(a,b);
//         int min=Math.min(a,b);
//         for(int i=0;i<min;i++){
//             max=max+1;
//         }
//         return max;
//     }
// }

class Solution {
    public int getSum(int a, int b) {
        return Integer.sum(a,b);
    }
}