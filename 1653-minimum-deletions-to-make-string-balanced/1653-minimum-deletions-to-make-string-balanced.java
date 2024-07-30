class Solution {
    public int minimumDeletions(String s) {
        if (s == null || s.length() <= 1) {
            return 0;
        }
        int countA = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a') {
                countA++;
            }
        }
        
        int minDeletions = countA;  
        int countB = 0;
        
        for (char c : s.toCharArray()) {
            if (c == 'a') {
                countA--;
            } else {
                countB++;
            }
            int deletions = countA + countB;
            minDeletions = Math.min(minDeletions, deletions);
        }
        
        return minDeletions;
    }
}

