class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int result=0;
        boolean oddfrequencyPresent=false;
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            int val=entry.getValue();
            
            result=result+(val/2)*2;
            
            if(val%2!=0){
                oddfrequencyPresent=true;
            }
        }
        return oddfrequencyPresent==false?result:result+1;
    }
}
