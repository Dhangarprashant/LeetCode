class Solution {
    public int[][] generateMatrix(int n) {
        
        int[][] result = new int[n][n];
        int top = 0;
        int right = n - 1;
        int bottom = n - 1;
        int left = 0;
        int num = 1;

        while (num <= n * n) {
            for (int i = left; i <= right; i++) {
                result[top][i] = num++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                result[i][right] = num++;
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result[bottom][i] = num++;
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result[i][left] = num++;
                }
                left++;
            }
        }
        return result;
    }
}
