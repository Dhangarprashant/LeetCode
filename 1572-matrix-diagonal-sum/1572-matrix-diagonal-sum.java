// class Solution {
//     public int diagonalSum(int[][] mat) {
//         int row=mat.length-1;
//         int col=mat[0].length-1;
//         int count=0;
//         if(row==col){
//             for(int i=0;i<row;i++){
//             for(int j=0;j<col;j++){
//                 count=count+mat[i][j];
//             }
//         }
//         for(int i=0;i<row;i++){
//             for(int j=0;j<col;j++){
//                 if(i==j){
//                     count=count-mat[i][j];
//                 }
//             }
//         }else{
            
//         }
//         }
//     }
// }

class Solution {
     public int diagonalSum(int[][] mat) {
     int sum = 0;
     for(int i = 0; i < mat.length; i++){
         for(int j = 0; j < mat[i].length; j++){
             if(i == j || mat.length - 1-i == j){
                 sum += mat[i][j];
             }
         }
     }
     return sum;
    }
}