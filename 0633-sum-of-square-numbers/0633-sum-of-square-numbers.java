// class Solution {
//     public boolean judgeSquareSum(int c) {
//         if(c==1 || c==0){
//             return true;
//         }else{
//             for(int i=0;i<c;i++){
//             for(int j=0;j<c;j++){
//                 if((i*i)+(j*j)==c){
//                     return true;
//                 }
//             }
//         }
//         }
//         return false;
//     }
// }

class Solution {
    public boolean judgeSquareSum(int c) {
        long start=0;
        long end=(int)Math.sqrt(c);
        while(start<=end){
            if(start*start+end*end==c){
                return true;
            }else if((start*start+end*end)>c){
                end--;
            }else{
                start++;
            }
        }
        return false;
    }
}
// class Solution {
//     public boolean judgeSquareSum(int c) {
//         long start=0;
//         long end=c;
//         while(start<=end){
//             long mid=start+(end-start)/2;
//             if(mid*mid>c)
//               end=mid-1;
//             else if(mid*mid==c)
//               return true;
//             else
//               break;
//         }
//       for(int i=0;i<=end;i++){
//           double b=Math.sqrt(c-i*i);
//           if(b==(int)b){
//               return true;
//           }
//       }
//       return false ;
// }
// }