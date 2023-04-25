class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> winer=new HashMap<>();
        HashMap<Integer,Integer> loser=new HashMap<>();
        for(int i=0;i<matches.length;i++){
            winer.put(matches[i][0] , winer.getOrDefault(matches[i][0],0)+1);
            loser.put(matches[i][1] , loser.getOrDefault(matches[i][1],0)+1);
        }
        ArrayList<List<Integer>> answer = new ArrayList<>();
        ArrayList<Integer> ans1 = new ArrayList<>();
        ArrayList<Integer> ans2 = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:winer.entrySet()){
            int teamw=entry.getKey();
            if(!loser.containsKey(teamw)){
                ans1.add(teamw);
            }
        }
        Collections.sort(ans1);
        answer.add(ans1);
        for(Map.Entry<Integer,Integer> entry:loser.entrySet()){
            int value=entry.getValue();
            int team=entry.getKey();
            if(value==1){
                ans2.add(team);
            }
        }
        Collections.sort(ans2);
        answer.add(ans2);
        return answer;
    }
}

