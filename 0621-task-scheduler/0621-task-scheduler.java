class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] f=new int[26];
        for(char task : tasks){
            f[task -'A']++;
        }
        Arrays.sort(f);
        int chunk=f[25]-1;
        int idle=chunk * n;
        for(int i=24;i>=0;i--){
            idle=idle-Math.min(chunk,f[i]);
        }
        return idle < 0?tasks.length:idle+tasks.length;
    }
}