class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        ArrayList<String> list=new ArrayList<>();
        for(String word:words){
            if(isMatching(word,pattern)){
                list.add(word);
            }
        }
        return list;
    }
    public static boolean isMatching(String word,String pattern){
        HashSet<Character> set=new HashSet<>();
        HashMap<Character,Character> map=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char patternChar=pattern.charAt(i);
            char wordChar=word.charAt(i);
            if(map.containsKey(patternChar)==true){
                if(map.get(patternChar)!=wordChar){
                    return false;
                }
            }else{
                if(set.contains(wordChar)){
                    return false;
                }
                map.put(patternChar,wordChar);
                set.add(wordChar);
            }
        }
        return true;
    }
}



