class Solution {
    public int appendCharacters(String s, String t) {
        int i = 0; // Pointer for string s
        int j = 0; // Pointer for string t
        while (i < s.length()) {
  
            while (i < s.length() && s.charAt(i) != t.charAt(j)) {
                i++;
            }
            if (i == s.length()) {
                return t.length() - j;
            }
            i++;
            j++;
            if (j == t.length()) {
                return 0;
            }
        }
        return t.length() - j;
    }
}
