class Solution {
    public boolean areOccurrencesEqual(String s) {
        char arr[]=s.toCharArray();
        Arrays.sort(arr);
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int fre=map.get(s.charAt(0));
        for(char x:map.keySet()){
            if(map.get(x)!=fre){
                return false;
            }
        }
        return true;
    }
}

