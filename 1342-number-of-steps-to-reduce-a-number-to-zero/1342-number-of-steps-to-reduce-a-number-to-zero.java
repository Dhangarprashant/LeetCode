// class Solution {
//     public int numberOfSteps(int num) {
//         int count=0;
//         if(num==0){
//             return 0;
//         }else if(num==1){
//             return 1;
//         }else{
//             while(num>1){
//                 if(num%2==0){
//                     count++;
//                     num=num/2;
//                 }else{
//                     num=num-1;
//                     num=num/2;
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }

class Solution {
    public int numberOfSteps(int num) {
        int count=0;
        while(num>0){
            if(num%2==0){
                num=num/2;
                count++;
            }else{
                num=num-1;
                count++;
            }
        }
        return count;
    }
}