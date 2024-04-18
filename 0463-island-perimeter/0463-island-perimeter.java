// class Solution {
//     int count=0;
//     public int islandPerimeter(int[][] grid) {
//         count=0;
//         for(int i=0;i<grid.length;i++){
//             for(int j=0;j<grid[0].length;j++){
//                 if(grid[i][j]==1){
//                     dfs(grid , i ,j);
//                     break;
//                 }
//             }
//         }
//         return count;
//     }
//     private void dfs(int[][] grid,int i,int j){
//         if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]==0){
//             count++;
//             return ;
//         }
//         if(grid[i][j]==-1){
//             return;
//         }
//         grid[i][j]=-1;
        
//         dfs(grid,i+1,j);
//         dfs(grid,i-1,j);
//         dfs(grid,i,j+1);
//         dfs(grid,i,j-1);
//     }
// }

 class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    perimeter += 4; 

                    if (i > 0 && grid[i - 1][j] == 1) {
                        perimeter -= 1;
                    }
                    if (i < rows - 1 && grid[i + 1][j] == 1) {
                        perimeter -= 1;
                    }
                    if (j > 0 && grid[i][j - 1] == 1) {
                        perimeter -= 1;
                    }
                    if (j < cols - 1 && grid[i][j + 1] == 1) {
                        perimeter -= 1;
                    }
                }
            }
        }

        return perimeter;
    }
}
