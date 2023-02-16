class Solution {
    public int maximumWealth(int[][] accounts) {
        int row=accounts.length;
        int col=accounts[0].length;
        int max= Integer.MIN_VALUE;
        
        for(int i=0;i<row;i++){
            int count=0;
            for(int j=0;j<col;j++){
            count=count+accounts[i][j];
            }
            if(count>max) max=count;
                
        }
        return max;
    }
}