class Solution {
    public int minCost(String colors, int[] neededTime) {
        int i=0;
        int j=0;
        int totalTime=0;
        int n=colors.length();
        while(i<n && j<n){
            int maxTime=0;
            int currTotal=0;
            while(j<n && colors.charAt(i)==colors.charAt(j)){
                maxTime=Math.max(maxTime,neededTime[j]);
                currTotal=currTotal+neededTime[j];
                j++;
            }
            i=j;
            totalTime=totalTime+(currTotal-maxTime);
        }
        return totalTime;
    }
}