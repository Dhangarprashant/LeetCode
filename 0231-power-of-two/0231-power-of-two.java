// class Solution {
//     public boolean isPowerOfTwo(int n) {
//         String str="";
//         while(n!=0){
//             str+=n%2;
//             n=n/2;
//         }
//         int count=0;
//         for(int i=0;i<str.length();i++){
//             if(str.charAt(i)=='1'){
//                 count++;
//             }
//         }
//         return (count==1)?true:false;
//     }
// }
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        String str = "";
        while (n != 0) {
            str += n % 2;
            n = n / 2;
        }
        
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                count++;
            }
        }
        
        return count == 1;
    }
}
