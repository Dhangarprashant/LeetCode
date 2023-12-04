// class Solution {
//     public String largestGoodInteger(String num) {
//         char ans=-1;
//         for(int i=2;i<num.length();i++){
//             if(num.charAt(i)==num.charAt(i-1) && num.charAt(i)==num.charAt(i-2)){
//                 ans=Math.max(ans,num.charAt(i));
//             }
//         }
//         return (ans==-1)? "": string(3,ans);
//     }
// }

class Solution {
    public String largestGoodInteger(String num) {
        char ans = '\0';
        for (int i = 2; i < num.length(); i++) {
            if (num.charAt(i) == num.charAt(i - 1) && num.charAt(i) == num.charAt(i - 2)) {
                if (num.charAt(i) > ans) {
                    ans = num.charAt(i);
                }
            }
        }
        return (ans == '\0') ? "" : String.valueOf(ans).repeat(3);
    }
}
