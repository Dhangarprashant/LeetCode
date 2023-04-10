class Solution {
    public boolean stoneGame(int[] piles) {
        int fsum=0;
        int Ssum=0;
        int start=0;
        Arrays.sort(piles);
        int nums[]=new int[piles.length-1];
        for(int i=piles.length-1;i>0;i--){
            nums[start++]=piles[i];
        }
        for(int i=0;i<piles.length-1;){
            fsum=fsum+nums[i];
            i=i+2;
        }
        for(int i=1;i<piles.length-1;){
            Ssum=Ssum+nums[i];
            i=i+2;
        }
        if(fsum>Ssum){
            return true;
        }else
            return false;
    }
}
