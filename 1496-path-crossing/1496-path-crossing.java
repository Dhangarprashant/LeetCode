class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> set=new HashSet<>();
        int x=0;
        int y=0;
        set.add(0 + "," + 0);
        for(char ch:path.toCharArray()){
            if(ch=='N'){
                y++;
            }else if(ch=='S'){
                y--;
            }else if(ch=='W'){
                x--;
            }else if(ch=='E'){
                x++;
            }
            String coor=x + "," + y;
            if(set.contains(coor)){
                return true;
            }else{
                set.add(coor);
            }
        }
        return false;
    }
}