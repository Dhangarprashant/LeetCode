
class Solution {
    public int equalPairs(int[][] grid) {
        int n=grid.length;
        int count=0;
        HashMap<String,Integer> mapR=new HashMap<>();
        HashMap<String,Integer> mapC=new HashMap<>();
        for(int i=0;i<n;i++){
            String s="";
            for(int j=0;j<n;j++){
                s=s+(grid[i][j]+".");
            }
            mapR.put(s,mapR.getOrDefault(s,0)+1);
        }
        for(int j=0;j<n;j++){
            String s="";
            for(int i=0;i<n;i++){
                s=s+(grid[i][j]+".");
            }
            mapC.put(s,mapC.getOrDefault(s,0)+1);
        }
        for(String k:mapR.keySet()){
            if(mapC.containsKey(k)){
                count=count+(mapR.get(k)*mapC.get(k));
            }
        }
        return count;
    }
}

