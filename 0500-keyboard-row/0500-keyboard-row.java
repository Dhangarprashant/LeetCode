import java.util.*;

class Solution {
    public String[] findWords(String[] words) {
    
        Set<Character> row1 = new HashSet<>(Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'));
        Set<Character> row2 = new HashSet<>(Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'));
        Set<Character> row3 = new HashSet<>(Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'm'));

        List<String> result = new ArrayList<>();

        for (String word : words) {
            String lowerWord = word.toLowerCase();
            char firstChar = lowerWord.charAt(0);
            Set<Character> targetRow;
            if (row1.contains(firstChar)) {
                targetRow = row1;
            } else if (row2.contains(firstChar)) {
                targetRow = row2;
            } else {
                targetRow = row3;
            }
            boolean isValid = true;
            for (char c : lowerWord.toCharArray()) {
                if (!targetRow.contains(c)) {
                    isValid = false;
                    break;
                }
            }
            
            if (isValid) {
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }
}
