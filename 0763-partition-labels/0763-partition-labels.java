class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,i);
        }
        int prev=-1;
        int max=0;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            max=Math.max(max,map.get(ch));
            if(max==i){
                list.add(max-prev);
                prev=max;
            }
        }
        return list;
    }
}