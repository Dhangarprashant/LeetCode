

class Solution {
    public boolean checkString(String s) {
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == 'b' && s.charAt(j) == 'a') {
                    return false;
                }
            }
        }
        
        return true;
    }
}
