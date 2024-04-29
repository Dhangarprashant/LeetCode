class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set=new HashSet<>();
        for(int i=0;i<allowed.length();i++){
            set.add(allowed.charAt(i));
        }
        int count=0;
        for(String word:words){
            boolean flag=true;
            for(int i=0;i<word.length();i++){
                char ch=word.charAt(i);
                if(!set.contains(ch)){
                    flag=false;
                }
            }
            if(flag==true){
                count++;
            }
        }
        return count;
    }
}