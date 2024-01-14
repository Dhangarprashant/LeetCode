// class Solution {
//     public boolean closeStrings(String word1, String word2) {
        
//         if(word1.length()!=word2.length()){
//             return false;
//         }
        
//         HashMap<Character,Integer> map1=new HashMap<>();
//         HashMap<Character,Integer> map2=new HashMap<>();
        
//         for(int i=0;i<word1.length();i++){
//             map1.put(word1.charAt(i),map1.getOrDefault(word1.charAt(i),0)+1);
//         }
        
//         for(int i=0;i<word2.length();i++){
//             map2.put(word2.charAt(i),map2.getOrDefault(word2.charAt(i),0)+1);
//         }
        
//         Set<Integer> set1=new HashSet<>(map1.values());
//         Set<Integer> set2=new HashSet<>(map2.values());
        
//         return set1.equals(set2) && map1.keySet().equals(map2.keySet());
//     }
// }


class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        Map<Character, Integer> freqMap1 = new HashMap<>();
        Map<Character, Integer> freqMap2 = new HashMap<>();

        for (char ch : word1.toCharArray()) {
            freqMap1.put(ch, freqMap1.getOrDefault(ch, 0) + 1);
        }

        for (char ch : word2.toCharArray()) {
            freqMap2.put(ch, freqMap2.getOrDefault(ch, 0) + 1);
        }

        // Check if the character sets are the same
        if (!freqMap1.keySet().equals(freqMap2.keySet())) {
            return false;
        }

        // Check if the frequencies of frequencies are the same
        Map<Integer, Integer> freqCountMap1 = new HashMap<>();
        Map<Integer, Integer> freqCountMap2 = new HashMap<>();

        for (int freq : freqMap1.values()) {
            freqCountMap1.put(freq, freqCountMap1.getOrDefault(freq, 0) + 1);
        }

        for (int freq : freqMap2.values()) {
            freqCountMap2.put(freq, freqCountMap2.getOrDefault(freq, 0) + 1);
        }

        return freqCountMap1.equals(freqCountMap2);
    }
}

