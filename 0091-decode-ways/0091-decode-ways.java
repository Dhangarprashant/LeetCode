// class Solution {
//     public int numDecodings(String s) {
//         int dp[]=new int[s.length()];
//         Arrays.fill(dp,-1);
//         return nways(0,s,dp);
//     }
//     public static int nways(int i, String s,int dp[]){
//         if(i>=s.length()){
//             return 1;
//         }else if(s.charAt(i)=='0'){
//             return 0;
//         }else if(i==s.length()-1){
//             return 1;
//         }else if(dp[i]!=-1){
//             return dp[i];
//         }else if(s.charAt(i)=='1' || (s.charAt(i)=='2' && (s.charAt(i+1)>=48 && s.charAt(i+1)<=54))){
//             return nways(i+1,s,dp)+nways(i+2,s,dp);
//         }else{
//             return dp[i]=nways(i+1,s,dp);
//         }
//     }
// }



class Solution {
    public int numDecodings(String s) {
        int dp[] = new int[s.length()];
        Arrays.fill(dp, -1);
        return nways(0, s, dp);
    }

    public static int nways(int i, String s, int dp[]) {
        if (i >= s.length()) {
            return 1;
        } else if (s.charAt(i) == '0') {
            return 0;
        } else if (i == s.length() - 1) {
            return 1;
        } else if (dp[i] != -1) {
            return dp[i];
        } else if (s.charAt(i) == '1' || (s.charAt(i) == '2' && (s.charAt(i + 1) >= '0' && s.charAt(i + 1) <= '6'))) {
            return dp[i] = nways(i + 1, s, dp) + nways(i + 2, s, dp);
        } else {
            return dp[i] = nways(i + 1, s, dp);
        }
    }
}
