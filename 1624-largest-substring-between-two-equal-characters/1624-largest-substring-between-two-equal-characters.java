class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] firstOccurrence = new int[26];
        Arrays.fill(firstOccurrence, -1); // Initialize array with -1

        int max = -1;
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int charIndex = currentChar - 'a';

            if (firstOccurrence[charIndex] == -1) {
                // Record the first occurrence of the character
                firstOccurrence[charIndex] = i;
            } else {
                // Calculate the length of the substring between equal characters
                max = Math.max(max, i - firstOccurrence[charIndex] - 1);
            }
        }

        return max;
    }
}
