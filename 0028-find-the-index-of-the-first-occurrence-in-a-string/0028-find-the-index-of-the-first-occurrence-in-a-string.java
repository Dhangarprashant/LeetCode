// class Solution {
//     public int strStr(String haystack, String needle) {
//         int n=haystack.length();
//         int m=needle.length();
//         int count=0;
//         if(m > n){
//             return -1;
//         }else{
//             for(int i=0;i<=m-1;i++){
//                 if(haystack.charAt(i)==needle.charAt(i)){
//                     count++;
//                     return i;
//                 }
//             }if(count==m){
//                 return 0;
//             }
//         }
//         return -1;
//     }
// }

class Solution {
    public int strStr(String haystack, String needle) {
        int k=-1;
        if(haystack.contains(needle)){
            k=haystack.indexOf(needle);
        }
        return k;
    }
}