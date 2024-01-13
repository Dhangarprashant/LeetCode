class Solution 
{
    public int minSteps(String s, String t) 
    {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)-1);
        }
        int ans=0;
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            ans=ans+Math.abs(entry.getValue());
        }
        return ans/2;
    }
}
