// class Solution 

// {
//     public String gcdOfStrings(String str1, String str2) {
//         int length1=str1.length();
//         int length2=str2.length();
//         String result;
//         char[] arr1=new char[length1];
//         char[] arr2=new char[length2];
//         for(int i=0;i<length1;i++){
//             for(int j=0;j<length2;j++){
//                 if(arr1[i]==arr2[j]){
//                     result.concat(arr1[0]);
//                 }
//             }
//         }
//         return result;
//     }
// }


class Solution {
    public int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }    
    }
    
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }
}