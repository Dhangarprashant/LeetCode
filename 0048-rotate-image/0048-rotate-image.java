class Solution {
    public void rotate(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int pra[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                pra[i][j]=matrix[j][i];
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=pra[i][col-j-1];
            }
        }
    }
}



// class Solution {
//     public void rotate(int[][] matrix) {
//       int n = matrix.length;
//       int m=matrix[0].length;
//          int arr[][]=new int[n][n];
//          for(int i=0;i<n;i++)
//          {
//              for(int j=0;j<m;j++)
//              {
//                    arr[i][j]=matrix[j][i];
//              }
//          }
//          for(int i=0;i<n;i++)
//         {
//               for(int j=0;j<m;j++)
//               matrix[i][j]=arr[i][m-j-1];
//         }
//     }
// }


