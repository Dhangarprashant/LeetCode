class Solution {
    public boolean isSubsequence(String s, String t) {
        int count=0;
        for(int i=0;i<t.length() && count<s.length();i++){
            if(t.charAt(i)==s.charAt(count)){
                count++;
            }
        }
        if(count==s.length()){
            return true;
        }else{
            return false;
        }
    }
}
