class Solution {
    public int equalPairs(int[][] grid) {
        int count=0;
        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[0].length;c++){
                boolean flag=true;
                for(int i=0;i<grid.length;i++){
                    if(grid[r][i]!=grid[i][c]){
                        flag=false;
                        break;
                    }
                }
                if(flag==true){
                    count=count+1;
                }
            }
        }
        return count;
    }
}