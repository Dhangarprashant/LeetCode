class Solution {
    // public int lengthOfLastWord(String s) {
    //     s=s.trim();
    //     int length=0;
    //     int n=s.length()-1;
    //     while(s.charAt(n)!=' '){
    //         length++;
    //         n--;
    //     }
    //     return length;
    // }
     public int lengthOfLastWord(String s) {
        s = s.trim();
        int length = 0;
        int n = s.length() - 1;
        while (n >= 0 && s.charAt(n) != ' ') {
            length++;
            n--;
        }
        return length;
    }
}

