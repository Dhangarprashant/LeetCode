class Solution {
    public int hIndex(int[] citations) {
        int N=citations.length;
        for(int i=0;i<N;i++){
            if(N-i<=citations[i]){
                return N-i;
            }
        }
        return 0;
    }
}