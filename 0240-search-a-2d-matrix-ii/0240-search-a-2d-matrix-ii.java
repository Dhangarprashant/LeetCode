// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         int m=matrix.length;
//         int n=matrix[0].length;
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 if(matrix[i][j]==target){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=0;
        int c=matrix[0].length-1;
        while(r<matrix.length && c>=0){
            if(matrix[r][c]==target){
                return true;
            }else if(matrix[r][c]>target){
                c--;
            }else{
                r++;
            }
        }
        return false;
    }
}