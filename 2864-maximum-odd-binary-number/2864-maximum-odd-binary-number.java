// class Solution {
//     public String maximumOddBinaryNumber(String s) {
//         StringBuilder sb=new StringBuilder();
//         int ones=0;
//         int zeros=0;
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)=='1'){
//                 ones++;
//             }else{
//                 zeros++;
//             }
//         }
//         if(ones==1){
//             for(int z=0;z<zeros;z++){
//                 sb.append("0");
//             }
//             sb.append("1");
//         }else{
//             for(int i=0;i<ones-1;i++){
//                 sb.append("1");
//             }
//             for(int i=0;i<ones;i++){
//                 sb.append("0");
//             }
//             sb.append("1");
//         }
//         return sb.toString();
//     }
// }

class Solution {
    public String maximumOddBinaryNumber(String s) {
        int countOnes = 0;
        StringBuilder sb = new StringBuilder();
        
        for (char ch : s.toCharArray()) {
            if (ch == '1') {
                countOnes++;
            }
        }
        
        for (int i = 0; i < s.length() - 1; i++) {
            if (countOnes > 1) {
                countOnes--;
                sb.append('1');
            } else {
                sb.append('0');
            }
        }
        
        sb.append('1');
        return sb.toString();
    }
}
