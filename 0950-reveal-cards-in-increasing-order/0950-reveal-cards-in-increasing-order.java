class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n=deck.length;
        Arrays.sort(deck);
        int result[]=new int[n];
        Arrays.fill(result,0);
        boolean skip=false;
        int i=0;
        int j=0;
        while(i<n){
            if(result[j]==0){
                if(skip==false){
                    result[j]=deck[i];
                    i++;
                }
                skip=!skip;
            }
            j=(j+1)%n;
        }
        return result;
    }
}