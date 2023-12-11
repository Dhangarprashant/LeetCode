class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen=0;
        int currLen=0;
        boolean[] set=new boolean[256];
        int i=0;
        int j=-1;
        while(i<s.length()){
            char CharToAcquire=s.charAt(i);
            while(set[CharToAcquire]==true){
                j++;
                char CharToRelease=s.charAt(j);
                set[CharToRelease]=false;
            }
            set[CharToAcquire]=true;
            currLen=i-j;
            if(currLen>maxLen){
                maxLen=currLen;
            }
            i++;
        }
        return maxLen;
    }
}