class Solution {
    public String mergeAlternately(String word1, String word2) {
        int length=word1.length()+word2.length();
        StringBuilder pp=new StringBuilder("");
        for(int i=0;i<length+1;i++){
            if(i<word1.length()){
                pp.append(word1.charAt(i));
            }
            if(i<word2.length()){
                pp.append(word2.charAt(i));
            }
        }
        return pp.toString();
    }
}