
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length * mat[0].length != r * c) return mat; 

        int m = mat.length, n = mat[0].length; 
        int[][] res = new int[r][c]; 

        int x = 0, y = 0; 
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (y < c) {
                    res[x][y++] = mat[i][j];
                } else {
                    y = 0; 
                    res[++x][y++] = mat[i][j]; 
                }
            }
        }

        return res; 
    }
}