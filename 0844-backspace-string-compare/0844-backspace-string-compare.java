class Solution {
    public boolean backspaceCompare(String s, String t) {
        return getString(s).equals(getString(t));
    }
    private String getString(String str){
        StringBuilder sb=new StringBuilder();
        int hashCount=0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)=='#'){
                hashCount++;
                continue;
            }
            if(hashCount>0){
                hashCount--;
            }else{
                sb.insert(0,str.charAt(i));
            }
        }
        return sb.toString();
    }
}