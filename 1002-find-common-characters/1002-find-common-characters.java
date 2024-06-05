// class Solution {
//     public List<String> commonChars(String[] words) {
//         List<Character> list=new ArrayList<>();
//         HashMap<Character,Integer> map=new HashMap<>();
//         String first=words[0];
//         for(int i=0;i<first.length();i++){
//             map.put(first.charAt(i),map.getOrDefault(first.charAt(i),0)+1);
//         }
//         for(int i=1;i<words.length;i++){
//             String val=words[i];
//             for(int j=0;j<val.length();j++){
//                 if(map.containsKey(val.charAt(j))){
//                     list.add(val.charAt(j));
//                 }
//             }
//         }
//         return list;
//     }
// }

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();
        int[] charCount = new int[26];
        for (char c : words[0].toCharArray()) {
            charCount[c - 'a']++;
        }
        for (int i = 1; i < words.length; i++) {
            int[] currentWordCount = new int[26];
            for (char c : words[i].toCharArray()) {
                currentWordCount[c - 'a']++;
            }
            for (int j = 0; j < 26; j++) {
                charCount[j] = Math.min(charCount[j], currentWordCount[j]);
            }
        }
        for (int i = 0; i < 26; i++) {
            while (charCount[i] > 0) {
                result.add(String.valueOf((char) (i + 'a')));
                charCount[i]--;
            }
        }
        
        return result;
    }
}
