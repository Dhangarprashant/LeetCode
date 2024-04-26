class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()){
            return false;
        }
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<ransomNote.length();i++){
            map1.put(ransomNote.charAt(i),map1.getOrDefault(ransomNote.charAt(i),0)+1);
        }
        for(int i=0;i<magazine.length();i++){
            map2.put(magazine.charAt(i),map2.getOrDefault(magazine.charAt(i),0)+1);
        }

        for(int i = 0; i < ransomNote.length(); i++){
            char c = ransomNote.charAt(i);
            if(map1.get(c) == null || map2.get(c) == null || map1.get(c) > map2.get(c)){
                return false;
            }
        }
        return  true;
    }
}