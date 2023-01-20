class Solution {
    public int balancedStringSplit(String s) {
        int c1 = 0;
        int c2 = 0;
        int counter = 0;
        for (int i =0; i < s.length(); i++){
            if (s.charAt(i) == 'L') c1++;
            if (s.charAt(i) == 'R') c2++;
            if (c1==c2){
                counter++;
                c1 = 0;
                c2 = 0;
            }
        }
        return counter;
    }
}