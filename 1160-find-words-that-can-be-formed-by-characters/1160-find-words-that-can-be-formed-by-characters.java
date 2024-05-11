// class Solution {
//     public int countCharacters(String[] words, String chars) {
//         HashMap<Character,Integer> map=new HashMap<>();
//         for(int i=0;i<chars.length();i++){
//             map.put(chars.charAt(i),map.getOrDefault(chars.charAt(i),0)+1);
//         }
//         int sum=0;
//         for(int i=0;i<words.length;i++){
//             String word=words[i];
//             int len=word.length();
//             HashMap<Character,Integer> mapInner=new HashMap<>();
//             for(int k=0;k<word.length();k++){
//                 map.put(word.charAt(k),mapInner.getOrDefault(word.charAt(k),0)+1);
//             }
//             int j;
//             for(j=0;j<word.length();j++){
//                 if(map.containsKey(word.charAt(j))){
//                     if(map.get(word.charAt(j))>mapInner.get(word.charAt(j))){
//                         continue;
//                     }else{
//                         break;
//                     }
//                 }
//             }
//             if(j==len){
//                 sum=sum+len;
//             }
//         }
//         return sum;
//     }
// }

import java.util.HashMap;
class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : chars.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int sum = 0;
        for(String word : words) {
            HashMap<Character,Integer> tempMap = new HashMap<>(map); 
            boolean isValid = true;
            for(char c : word.toCharArray()) {
                if(tempMap.containsKey(c) && tempMap.get(c) > 0) {
                    tempMap.put(c, tempMap.get(c) - 1);
                } else {
                    isValid = false;
                    break;
                }
            }
            if(isValid) {
                sum += word.length();
            }
        }
        return sum;
    }
}
