// class Solution {
//     public int arrangeCoins(int n) {
//         int count=0;
//         while(n>0){
//             for(int i=1;i<n;i++){
//                 if(n>i){
//                     n--;
//                     count++;
//                 }else{
//                     break;
//                 }
//             }
//         }
//         return count;
//     }
// }

class Solution {
    public int arrangeCoins(int n) {
        long start=1,end=n,mid,ans=0;
        while(start<=end){
            mid = start +(end-start)/2;
            if((mid*(mid+1))/2<=n){
                ans=mid;
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return (int)ans;
    }
}
