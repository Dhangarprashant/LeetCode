class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        
        int length=dist.length;
        double[] t=new double[length];
        
        for(int i=0;i<length;i++){
            double time=(dist[i]*1.0)/speed[i];
            t[i]=time;
        }
        Arrays.sort(t);
        int count=0;
        int time=0;
        for(double temp:t){
            if(temp>time){
                count++;
            }else{
                break;
            }
            time++;
        }
        return count;
    }
}