// class Solution {
//     public String toLowerCase(String s) {
//         return s.toLowerCase();
//     }
// }

class Solution {
    public String toLowerCase(String s) {
        String prashant="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                prashant=prashant+(char)(s.charAt(i)+32);
            }else{
                prashant=prashant+s.charAt(i);
            }
        }
        return prashant;
    }
}
