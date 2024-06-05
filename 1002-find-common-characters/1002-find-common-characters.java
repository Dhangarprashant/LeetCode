

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
