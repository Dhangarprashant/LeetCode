class Solution {
    public boolean hasAlternatingBits(int n) {
        String ans="";
        while(n!=0){
            ans=ans+n%2;
            n=n/2;
        }
        for(int i=1;i<ans.length();i++){
            if(ans.charAt(i-1)==ans.charAt(i)){
                return false;
            }
        }
        return true;
    }
}