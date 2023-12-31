class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int max=-1;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            if(map.containsKey(ch)){
                int left=map.get(s.charAt(right));
                max=Math.max(max,right-left-1);
            }else{
                map.put(s.charAt(right),right);
            }
        }
        return max;
    }
}