class Solution {
    public boolean isSubstringPresent(String s) {
        String reverse="";
        for(int i=s.length()-1;i>=0;i--){
            reverse+=s.charAt(i);
        }
        for(int i=0;i<s.length()-1;i++){
            String sub=s.substring(i,i+2);
            if(reverse.contains(sub)){
                return true;
            }
        }
        return false;
    }
}