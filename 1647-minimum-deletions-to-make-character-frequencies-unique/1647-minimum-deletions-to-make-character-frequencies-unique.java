class Solution {
    public int minDeletions(String s) {
        int deletion=0;
        int[] freq=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        Set<Integer> set=new HashSet<>();
        for(int count:freq){
            while(count > 0 && set.contains(count)){
                deletion++;
                count--;
            }
            set.add(count);
        }
        return deletion;
    }
}