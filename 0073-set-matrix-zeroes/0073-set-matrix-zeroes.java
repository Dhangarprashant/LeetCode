class Solution {
    public void setZeroes(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int ans1[]=new int[row];
        int ans2[]=new int[col];
        Arrays.fill(ans1,-1);
        Arrays.fill(ans2,-1);
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    ans1[i]=0;
                    ans2[j]=0;
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(ans1[i]==0 || ans2[j]==0){
                    matrix[i][j]=0;
                }
            }
        }
    }
}

