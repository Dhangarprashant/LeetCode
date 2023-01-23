// class Solution
// {
//     public boolean isAnagram(String s, String t) 
//     {
//         char[] charArray1 = s.toCharArray();
//         Arrays.sort(charArray1);
//         char[] charArray2 = t.toCharArray();
//         Arrays.sort(charArray2);
//         if(s.length()!=t.length()){
//             return false;
//         }
//         for(int i=0;i<s.length();i++)
//         {
//             for(int j=0;j<t.length();j++)
//             {
//                 if(charArray1[i]==charArray2[j])
//                 {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }


class Solution {
    public boolean isAnagram(String s, String t) {
        s=s.toLowerCase();
        t=t.toLowerCase();
        if(s.length()!=t.length()){
            return false;
        }else{
            char[] ss=s.toCharArray();
            char[] st=t.toCharArray();
            Arrays.sort(ss);
            Arrays.sort(st);
            boolean flag=Arrays.equals(ss,st);
            if(flag){
                return true;
            }else{
                return false;
            }

        }

    }
}