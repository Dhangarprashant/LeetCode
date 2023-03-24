class Solution {
    public int distributeCandies(int[] candyType) {
        int p=(candyType.length)/2;
        Arrays.sort(candyType);
        int count=1;
        for(int i=0;i<candyType.length-1;i++){
            if(candyType[i]!=candyType[i+1]){
                count++;
            }
        }
        if(count<p){
            return count;
        }
        return p;
    }
}


