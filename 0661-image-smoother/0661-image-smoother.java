class Solution {
    public int[][] imageSmoother(int[][] img) {
        int res[][]=new int[img.length][img[0].length];
        for(int i=0;i<img.length;i++){
            for(int j=0;j<img[0].length;j++){
                res[i][j]=smoother(img,i,j);
            }
        }
        return res;
    }
    public static int smoother(int img[][],int x,int y){
        int m=img.length;
        int n=img[0].length;
        int sum=0;
        int count=0;
        for(int i=-1;i<=1;i++){
            for(int j=-1;j<=1;j++){
                int nx=i+x;
                int ny=j+y;
                if(nx<0 ||nx>=m || ny<0 || ny>=n){
                    continue;
                }
                sum=sum+img[nx][ny];
                count++;
            }
        }
        return sum/count;
    }
}