class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int max=0;
        int first=-1;
        int last=-1;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
                continue;
            }else if(first==-1){
                first=i;
                last=i;
            }else{
                last=i;
            }
        }
        
        // All zeroes
        if(first==-1){
            return n<=(flowerbed.length+1)/2;
        }
        
        // count starting all zero and last all zero
        max=first/2;
        max=max+(flowerbed.length-last-1)/2;
        
        //All middle
        int count=0;
        for(int i=first+1;i<=last-1;i++){
            if(flowerbed[i]==0){
                count++;
            }else{
                max=max+(count-1)/2;
                count=0;
            }
        }
        max=max+(count-1)/2;
        return n<=max;
    }
}