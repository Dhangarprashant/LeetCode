// class Solution {
//     public List<Integer> spiralOrder(int[][] matrix) {
//         List<Integer> spiral=new ArrayList<Integer>();
//         if(matrix.length==0)
//             return spiral;
//         int m=matrix.length;
//         int n=matrix[0].length;
//         int i=0;
//         int j=0;
//         int k=0;
//         while(i<m && j<n){
//             for(k=j;k<n;k++){
//                 spiral.add(matrix[i][k]);
//             }
//             i++;
//              for(k=i;k<m;k++){
//                 spiral.add(matrix[k][n-l]);
//             }
//             n--;
//             if(i<m){
//                 for(k=n-1;k>=j;--k){
//                     spiral.add(matrix[m-1][k]);
//                 }
//                 m--;
//             }
//             if(j<n){
//                 for(k=m-1;k>=i;--k){
//                     spiral.add(matrix[k][j]);
//                 }
//                 j++;
//             }
//         }
//         return spiral;
//     }
// }
class Solution 
{
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        List<Integer> li = new ArrayList();

        int row_start = 0;
        int row_end = matrix.length-1;
        int col_start = 0;
        int col_end = matrix[0].length-1;

        while(row_start <= row_end && col_start <= col_end)
        {
            for(int i = col_start; i <= col_end; i++)
            {
                li.add(matrix[row_start][i]);
            }

            row_start++;

            for(int i = row_start; i <= row_end; i++)
            {
                li.add(matrix[i][col_end]);
            }
            col_end--;

            if(row_start <= row_end)
            {
                for(int i = col_end; i >= col_start; i--)
                {
                    li.add(matrix[row_end][i]);
                }

                row_end--;
            }

            if(col_start <= col_end)
            {
                for(int i = row_end; i >= row_start; i--)
                {
                    li.add(matrix[i][col_start]);
                }

                col_start++;
            }
        } 
        return li;
        
    }
}
