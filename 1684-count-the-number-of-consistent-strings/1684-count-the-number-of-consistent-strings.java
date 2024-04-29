class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean allowed_arr[]=new boolean[26];
        for(int i=0;i<allowed.length();i++){
            allowed_arr[allowed.charAt(i)-'a']=true;
        }
        int count=0;
        for(String word:words){
            boolean flag=true;
            for(int i=0;i<word.length();i++){
                char ch=word.charAt(i);
                if(allowed_arr[ch-'a']==false){
                    flag=false;
                    break;
                }
            }
            if(flag){
                count++;
            }
        }
        return count;
    }
}