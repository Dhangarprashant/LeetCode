class Solution {
    public boolean checkRecord(String s) {
        int count_a=0;
        int count_l=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                count_a++;
                if(count_a>=2){
                    return false;
                }
            }
            if(s.charAt(i)=='L'){
                count_l++;
                if(count_l>=3){
                    return false;
                }
            }else{
                count_l=0;
            }
        }
        return true;
    }
}
