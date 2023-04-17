class Solution {
    public int mostWordsFound(String[] sentences) {
        int count=0;
        for(String sentence:sentences){
            int words=sentence.split("\\s+").length;
            if(words>count){
                count=words;
            }
        }
        return count;
    }
}