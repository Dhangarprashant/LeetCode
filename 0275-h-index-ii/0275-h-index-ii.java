// class Solution {
//     public int hIndex(int[] citations) {
//         int N=citations.length;
//         for(int i=0;i<N;i++){
//             if(N-i<=citations[i]){
//                 return N-i;
//             }
//         }
//         return 0;
//     }
// }

class Solution {
    public int hIndex(int[] citations) {
        int ans=0;
        int start=0;
        int n=citations.length;
        int end=n;
        while(start<end){
            int mid=start+(end-start)/2;
            if(n-mid<=citations[mid]){
                ans=Math.max(n-mid,ans);
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
}