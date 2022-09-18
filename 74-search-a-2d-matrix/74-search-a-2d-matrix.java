class Solution 
{
    public boolean searchMatrix(int[][] matrix, int target) 
    {
//       if(matrix.length==0)
//           return false;
      
//         int n=matrix.length;
//         int m=matrix[0].length;
        
//         int left=0;
//         int right=(n * m) - 1;
//         while(left<=right){
//             int mid=(left+right)/2;
//             if(matrix[mid/m][mid%m]==target){
//                 return true;
//             }
//             if(matrix[mid/m][mid%m]<target){
//                 left=mid+1;
//             }
//             else{
//                 right=mid-1;
//             }
//         }
//         return false;
        for ( int i =0 ; i< matrix.length;i++){
            for( int j =0 ; j< matrix[0].length;j++){
                if(matrix[i][j] == target)
                    return true;
            }
        }
        return false;
    }
}