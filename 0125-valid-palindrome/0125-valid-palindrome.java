// class Solution {
//     public boolean isPalindrome(String s) {
//         char[] ch = s.toCharArray();
//         int length=ch.length;
//         int start=0;
//         int end=length-1;
//         for(int i=0;i<length;i++){
//             for(int j=length;j>0;j--){
//                 if(i<=j){
//                     if(ch[i]==ch[j]){
//                     return true;
//                 }else{
//                         break;
//                     }
//                 }
//             }
//         }
//         return false;
//     }
// }

// class Solution {
//     public boolean isPalindrome(String s) {
        
//         char[] ch = s.toCharArray();
//         int length=ch.length;
//         int start=0;
//         int end=length-1;
//         if(length==1){
//             return true;
//         }
//         while(start<=end){
//             if(ch[start]==ch[end]){
//                 return true;
//             }
//             start++;
//             end--;
//         }
//         return false;
//     }
// }



class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev+= s.charAt(i);
        }
        if (s.equals(rev)){
            return true;
        }
        return false;
    }
}